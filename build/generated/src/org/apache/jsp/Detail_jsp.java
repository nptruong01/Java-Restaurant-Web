package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            .gallery-wrap .img-big-wrap img {\n");
      out.write("                height: 450px;\n");
      out.write("                width: auto;\n");
      out.write("                display: inline-block;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .gallery-wrap .img-small-wrap .item-gallery {\n");
      out.write("                width: 60px;\n");
      out.write("                height: 60px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                margin: 7px 2px;\n");
      out.write("                display: inline-block;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gallery-wrap .img-small-wrap {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .gallery-wrap .img-small-wrap img {\n");
      out.write("                max-width: 100%;\n");
      out.write("                max-height: 100%;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("            .img-big-wrap img{\n");
      out.write("                width: 100% !important;\n");
      out.write("                height: auto !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Left.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <aside class=\"col-sm-5 border-right\">\n");
      out.write("                                    <article class=\"gallery-wrap\"> \n");
      out.write("                                        <div class=\"img-big-wrap\">\n");
      out.write("                                            <div> <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a></div>\n");
      out.write("                                        </div> <!-- slider-product.// -->\n");
      out.write("                                        <div class=\"img-small-wrap\">\n");
      out.write("                                        </div> <!-- slider-nav.// -->\n");
      out.write("                                    </article> <!-- gallery-wrap .end// -->\n");
      out.write("                                </aside>\n");
      out.write("                                <aside class=\"col-sm-7\">\n");
      out.write("                                    <article class=\"card-body p-5\">\n");
      out.write("                                        <h3 class=\"title mb-3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("                                        <p class=\"price-detail-wrap\"> \n");
      out.write("                                            <span class=\"price h3 text-warning\"> \n");
      out.write("                                                <span class=\"currency\">US $</span><span class=\"num\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                            </span> \n");
      out.write("                                        </p> <!-- price-detail-wrap .// -->\n");
      out.write("                                        <dl class=\"item-property\">\n");
      out.write("                                            <dt>Description</dt>\n");
      out.write("                                            <dd><p>\n");
      out.write("                                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                                </p></dd>\n");
      out.write("                                        </dl>\n");
      out.write("\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-5\">\n");
      out.write("                                                <dl class=\"param param-inline\">\n");
      out.write("                                                    <dt>Quantity: </dt>\n");
      out.write("                                                    <dd>\n");
      out.write("                                                        <select class=\"form-control form-control-sm\" style=\"width:70px;\">\n");
      out.write("                                                            <option> 1 </option>\n");
      out.write("                                                            <option> 2 </option>\n");
      out.write("                                                            <option> 3 </option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </dd>\n");
      out.write("                                                </dl>  <!-- item-property .// -->\n");
      out.write("                                            </div> <!-- col.// -->\n");
      out.write("\n");
      out.write("                                        </div> <!-- row.// -->\n");
      out.write("                                        <hr>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-primary text-uppercase\"> Buy now </a>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-outline-primary text-uppercase\"> <i class=\"fas fa-shopping-cart\"></i> Add to cart </a>\n");
      out.write("                                    </article> <!-- card-body.// -->\n");
      out.write("                                </aside> <!-- col.// -->\n");
      out.write("                            </div> <!-- row.// -->\n");
      out.write("                        </div> <!-- card.// -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
