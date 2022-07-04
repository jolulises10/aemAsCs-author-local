package com.adobe.aem.guides.wknd.core.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.sling.models.export.spi.ModelExporter;
import org.osgi.service.component.annotations.Component;

import java.util.Map;

@Component(service = ModelExporter.class)
public class JacksonUnitTestInjection implements ModelExporter {
    public <T> T export(Object model, Class<T> clazz,
                        Map<String, String> options)
            throws org.apache.sling.models.factory.ExportException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (T) mapper.writeValueAsString(model);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return (T) "";
    }
    public String getName()
    {
        return "jackson";
    }
    public boolean isSupported(Class Model1)
    {
        return true;
    }
}