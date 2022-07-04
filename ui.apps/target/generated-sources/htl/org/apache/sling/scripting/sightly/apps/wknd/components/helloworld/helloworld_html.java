/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.helloworld;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class helloworld_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _dynamic_hello = bindings.get("hello");
Object _global_model = null;
out.write("\n\n");
{
    String var_0 = (((((("<!-- code before\n<p data-sly-test=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "comment"))) + "\">Text property: ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "comment"))) + "</p>\n\n<pre data-sly-use.hello=\"com.adobe.aem.guides.wknd.core.models.HelloWorldModel\">\nHelloWorldModel says:\n") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_hello, "message"), "comment"))) + "\n</pre>\n-->");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("\n\n");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.HelloWorldModel.class.getName(), obj());
out.write("<div>\n    ");
{
    Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_global_model, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
        out.write("<h1>");
        {
            Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</h1>");
    }
}
out.write("\n    ");
{
    Object var_testvariable3 = renderContext.getObjectModel().resolveProperty(_global_model, "text");
    if (renderContext.getObjectModel().toBoolean(var_testvariable3)) {
        out.write("<div>\n        <p>Text property from Sling:</p>\n        <pre>");
        {
            Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text"), "text");
            out.write(renderContext.getObjectModel().toString(var_4));
        }
        out.write("</pre>\n    </div>");
    }
}
out.write("\n    ");
{
    Object var_testvariable5 = renderContext.getObjectModel().resolveProperty(_global_model, "message");
    if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
        out.write("<div>\n        <p>Model message:</p>\n        <pre>");
        {
            Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "message"), "text");
            out.write(renderContext.getObjectModel().toString(var_6));
        }
        out.write("</pre>\n    </div>");
    }
}
out.write("\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

