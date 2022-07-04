package com.adobe.aem.guides.wknd.core.servlets;


import com.adobe.aem.guides.wknd.core.models.HelloWorldModel;
import com.adobe.aem.guides.wknd.core.utils.JacksonUnitTestInjection;
import com.google.common.collect.ImmutableMap;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.factory.ExportException;
import org.apache.sling.models.factory.MissingExporterException;
import org.apache.sling.models.factory.ModelFactory;
import org.apache.sling.testing.mock.sling.servlet.MockSlingHttpServletRequest;
import org.apache.sling.testing.mock.sling.servlet.MockSlingHttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
public class HelloWorldComponentServletTest {

    private HelloWorldComponentServlet helloWorldServlet = new HelloWorldComponentServlet();
    private String jsonGetResponse;
    private final AemContext ctx = new AemContext();

    @Mock
    private ModelFactory modelFactory;

    @BeforeEach
    public void setup() throws Exception {
        jsonGetResponse = "";
        ctx.build().resource("/content/wknd/language-masters/en/page-content-jur/jcr:content/root/container/helloworld"
                , ImmutableMap.<String, Object>builder()
                        .put("sling:resourceType", "wknd/components/helloworld")
                        .put("jcr:title", "resource title")
                        .put("title", "testing title")
                        .put("text", "testing text")
                        .build()).commit();

        ctx.registerService(ModelFactory.class, modelFactory, org.osgi.framework.Constants.SERVICE_RANKING,
                Integer.MAX_VALUE);
    }

    @Test
    void doGetNoParam() {

        Throwable exception = assertThrows(
                ServletException.class, () -> {
                    MockSlingHttpServletRequest request = ctx.request();
                    MockSlingHttpServletResponse response = ctx.response();
                    helloWorldServlet.doGet(request, response);

                    //assertEquals(jsonGetResponse, response.getOutputAsString());
                }
        );

        assertEquals("No param found in request", exception.getMessage());
    }

    @Test
    void doGetParam() throws ServletException, IOException {
        jsonGetResponse = "{\"title\":\"Hello World Component\",\"text\":\"This is a custom component\",\"message\":\"Hello World!\\nResource type is: wknd/components/helloworld\\nCurrent page is:  /content/wknd/language-masters/en/page-content-jur\\n\"}";
        HashMap<String,Object> params = new HashMap<>();
        try{
            when(modelFactory.exportModel(any(HelloWorldModel.class),eq("jackson"), eq(String.class), eq(new HashMap<>())))
                    .thenReturn(jsonGetResponse);
        } catch (ExportException|MissingExporterException e) {
            e.printStackTrace();
        }

        MockSlingHttpServletRequest request = ctx.request();
        MockSlingHttpServletResponse response = ctx.response();

        params.put("aemPath","/content/wknd/language-masters/en/page-content-jur/jcr:content/root/container/helloworld");

        request.setParameterMap(params);

        helloWorldServlet.doGet(request, response);

        assertEquals(jsonGetResponse, response.getOutputAsString());
    }

    @Test
    void doGetParamNoResource() throws ServletException, IOException {

        Throwable exception = assertThrows(
                ServletException.class, () -> {
                    HashMap<String,Object> params = new HashMap<>();


                    MockSlingHttpServletRequest request = ctx.request();
                    MockSlingHttpServletResponse response = ctx.response();

                    params.put("aemPath","/content/wknd/language-masters/en/page-content-jur/jcr:content/root/container/helloworld15");

                    request.setParameterMap(params);

                    helloWorldServlet.doGet(request, response);

                    //assertEquals(jsonGetResponse, response.getOutputAsString());
                }
        );

        assertEquals("No resource found for the given jcr path", exception.getMessage());
    }

}
