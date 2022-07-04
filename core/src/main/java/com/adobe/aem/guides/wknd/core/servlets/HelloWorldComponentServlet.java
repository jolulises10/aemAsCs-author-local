package com.adobe.aem.guides.wknd.core.servlets;

import javax.jcr.RepositoryException;
import javax.servlet.Servlet;

import com.adobe.aem.guides.wknd.core.models.HelloWorldModel;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.models.factory.ExportException;
import org.apache.sling.models.factory.MissingExporterException;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.jcr.Node;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Optional;

@Component(
        service={Servlet.class},
        property={"sling.servlet.methods=get,post"
                , "sling.servlet.paths=/bin/helloWorldComponentServlet"
        //,"sling.auth.requirements= -/bin/helloWorldComponentServlet"
        }
)
public class HelloWorldComponentServlet extends SlingAllMethodsServlet {

    private static final long serialVersionUID = 1L;

    private static final String QUERY_PARAM_NAME = "aemPath";
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String NO_PARAM_ERROR = "No param found in request";
    private static final String NO_RESOURCE_ERROR = "No resource found for the given jcr path";
    private static final String TECHNICAL_ERROR = "Other technical error";

    private static final Logger log = LoggerFactory.getLogger(HelloWorldComponentServlet.class);

    /**
     * Add a node to the page-content-jur page. Testing purposes
     * @param request
     * @param response
     */
    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
    {
        try {
            ResourceResolver resourceResolver = request.getResourceResolver();
            //TODO: read the node name from request body
            Resource resource = resourceResolver.getResource("/content/wknd/language-masters/en/page-content-jur");
            log.info("Resource is at path {}", resource.getPath());
            Node node = resource.adaptTo(Node.class);
            Node newNode = node.addNode("demoNode", "nt:unstructured"); //demoNode to be replaced
            newNode.setProperty("name", "Demo Node"); //property name and property value to be replaced by json body request
            resourceResolver.commit();
        } catch (PersistenceException|RepositoryException e) {
            log.error(e.getMessage(), e);
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException,IOException {
        String jsonObj = "";
        Optional<String> pathParam = Optional.ofNullable(request.getParameter(QUERY_PARAM_NAME));
        if(!pathParam.isPresent()){
            throw new ServletException(NO_PARAM_ERROR);
        }

        ResourceResolver resourceResolver = request.getResourceResolver();
        Optional<Resource> resource = Optional.ofNullable(resourceResolver.getResource(pathParam.get()));

        if(!resource.isPresent()){
            throw new ServletException(NO_RESOURCE_ERROR);
        }

        HelloWorldModel model = resource.get().adaptTo(HelloWorldModel.class);
        try {
            jsonObj = model.getJsonFromModel();
        } catch (ExportException|MissingExporterException e) {
            log.error(e.getMessage(), e);
            throw new ServletException(TECHNICAL_ERROR,e);
        }

        response.setContentType(CONTENT_TYPE_JSON);
        response.getWriter().write(jsonObj);
    }
}
