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
package org.apache.sling.scripting.sightly.apps.wknd.components.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class favicons_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlibresources = null;
out.write("\n\n\n");
_global_clientlibresources = "/etc.clientlibs/wknd/clientlibs/clientlib-site/resources";
out.write("<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent0 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-32.png");
    {
        Object var_shoulddisplayattr1 = ((renderContext.getObjectModel().toBoolean(var_attrcontent0) ? var_attrcontent0 : ("false".equals(var_attrcontent0))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr1)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent0));
            out.write("\"");
        }
    }
}
out.write("/>\n<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent2 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-32.png");
    {
        Object var_shoulddisplayattr3 = ((renderContext.getObjectModel().toBoolean(var_attrcontent2) ? var_attrcontent2 : ("false".equals(var_attrcontent2))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr3)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent2));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"32x32\"/>\n<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent4 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-128.png");
    {
        Object var_shoulddisplayattr5 = ((renderContext.getObjectModel().toBoolean(var_attrcontent4) ? var_attrcontent4 : ("false".equals(var_attrcontent4))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr5)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent4));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"128x128\"/>\n<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent6 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-152.png");
    {
        Object var_shoulddisplayattr7 = ((renderContext.getObjectModel().toBoolean(var_attrcontent6) ? var_attrcontent6 : ("false".equals(var_attrcontent6))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr7)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent6));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"152x152\"/>\n<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent8 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-167.png");
    {
        Object var_shoulddisplayattr9 = ((renderContext.getObjectModel().toBoolean(var_attrcontent8) ? var_attrcontent8 : ("false".equals(var_attrcontent8))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr9)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent8));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"167x167\"/>\n<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent10 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-180.png");
    {
        Object var_shoulddisplayattr11 = ((renderContext.getObjectModel().toBoolean(var_attrcontent10) ? var_attrcontent10 : ("false".equals(var_attrcontent10))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr11)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent10));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"180x180\"/>\n<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent12 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-192.png");
    {
        Object var_shoulddisplayattr13 = ((renderContext.getObjectModel().toBoolean(var_attrcontent12) ? var_attrcontent12 : ("false".equals(var_attrcontent12))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr13)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent12));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"192x192\"/>\n<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent14 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-512.png");
    {
        Object var_shoulddisplayattr15 = ((renderContext.getObjectModel().toBoolean(var_attrcontent14) ? var_attrcontent14 : ("false".equals(var_attrcontent14))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr15)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent14));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"512x512\"/>\n\n\n<link rel=\"shortcut icon\" type=\"image/png\" sizes=\"192x192\"");
{
    String var_attrcontent16 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-192.png");
    {
        Object var_shoulddisplayattr17 = ((renderContext.getObjectModel().toBoolean(var_attrcontent16) ? var_attrcontent16 : ("false".equals(var_attrcontent16))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr17)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent16));
            out.write("\"");
        }
    }
}
out.write("/>\n\n\n<link rel=\"apple-touch-icon\" type=\"image/png\"");
{
    String var_attrcontent18 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-128.png");
    {
        Object var_shoulddisplayattr19 = ((renderContext.getObjectModel().toBoolean(var_attrcontent18) ? var_attrcontent18 : ("false".equals(var_attrcontent18))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr19)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent18));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"128x128\"/>\n<link rel=\"apple-touch-icon\" type=\"image/png\"");
{
    String var_attrcontent20 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-152.png");
    {
        Object var_shoulddisplayattr21 = ((renderContext.getObjectModel().toBoolean(var_attrcontent20) ? var_attrcontent20 : ("false".equals(var_attrcontent20))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr21)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent20));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"152x152\"/>\n<link rel=\"apple-touch-icon\" type=\"image/png\"");
{
    String var_attrcontent22 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-167.png");
    {
        Object var_shoulddisplayattr23 = ((renderContext.getObjectModel().toBoolean(var_attrcontent22) ? var_attrcontent22 : ("false".equals(var_attrcontent22))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr23)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent22));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"167x167\"/>\n<link rel=\"apple-touch-icon\" type=\"image/png\"");
{
    String var_attrcontent24 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/favicon-180.png");
    {
        Object var_shoulddisplayattr25 = ((renderContext.getObjectModel().toBoolean(var_attrcontent24) ? var_attrcontent24 : ("false".equals(var_attrcontent24))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr25)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent24));
            out.write("\"");
        }
    }
}
out.write(" sizes=\"180x180\"/>\n\n\n<meta name=\"msapplication-TileColor\" content=\"#FFFFFF\"/>\n<meta name=\"msapplication-TileImage\"");
{
    String var_attrcontent26 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "attribute")) + "/images/favicons/favicon-152.png");
    {
        Object var_shoulddisplayattr27 = ((renderContext.getObjectModel().toBoolean(var_attrcontent26) ? var_attrcontent26 : ("false".equals(var_attrcontent26))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr27)) {
            out.write(" content=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent26));
            out.write("\"");
        }
    }
}
out.write("/>\n\n\n<link rel=\"preload\"");
{
    String var_attrcontent28 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/fonts/wknd-icon-font.ttf");
    {
        Object var_shoulddisplayattr29 = ((renderContext.getObjectModel().toBoolean(var_attrcontent28) ? var_attrcontent28 : ("false".equals(var_attrcontent28))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr29)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent28));
            out.write("\"");
        }
    }
}
out.write(" as=\"font\" type=\"font/ttf\" crossorigin/>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

