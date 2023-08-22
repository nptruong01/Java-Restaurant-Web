package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>Sign Up</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tcolor: #434343;\n");
      out.write("\tbackground: #dfe7e9;\n");
      out.write("\tfont-family: 'Varela Round', sans-serif;\n");
      out.write("}\n");
      out.write(".form-control {\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\ttransition: all 0.4s;\n");
      out.write("\tbox-shadow: none;\n");
      out.write("}\n");
      out.write(".form-control:focus {\n");
      out.write("\tborder-color: #5cb85c;\n");
      out.write("}\n");
      out.write(".form-control, .btn {\n");
      out.write("\tborder-radius: 50px;\n");
      out.write("\toutline: none !important;\n");
      out.write("}\n");
      out.write(".signin-form {\n");
      out.write("\twidth: 400px;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tpadding: 30px 0;\n");
      out.write("}\n");
      out.write(".signin-form form {\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tbox-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("\tpadding: 40px;\n");
      out.write("}\n");
      out.write(".signin-form a {\n");
      out.write("\tcolor: white;\n");
      out.write("}    \n");
      out.write(".signin-form h2 {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 34px;\n");
      out.write("\tmargin: 10px 0 15px;\n");
      out.write("}\n");
      out.write(".signin-form .hint-text {\n");
      out.write("\tcolor: #999;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".signin-form .form-group {\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".signin-form .btn {        \n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tline-height: 26px;        \n");
      out.write("\tfont-weight: bold;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".signin-form .small {\n");
      out.write("\tfont-size: 13px;\n");
      out.write("}\n");
      out.write(".signin-btn {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tborder-color: #5cb85c;\n");
      out.write("\ttransition: all 0.4s;\n");
      out.write("}\n");
      out.write(".signin-btn:hover {\n");
      out.write("\tbackground: #5cb85c;\n");
      out.write("\topacity: 0.8;\n");
      out.write("}\n");
      out.write(".or-seperator {\n");
      out.write("\tmargin: 50px 0 15px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tborder-top: 1px solid #e0e0e0;\n");
      out.write("}\n");
      out.write(".or-seperator b {\n");
      out.write("\tpadding: 0 10px;\n");
      out.write("\twidth: 40px;\n");
      out.write("\theight: 40px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tline-height: 40px;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tborder: 1px solid #e0e0e0;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: -22px;\n");
      out.write("\tz-index: 1;\n");
      out.write("}\n");
      out.write(".social-btn .btn {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tmargin: 10px 0 0 30px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\twidth: 55px;\n");
      out.write("\theight: 55px;\n");
      out.write("\tline-height: 45px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tfont-weight: normal;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tborder: none;\n");
      out.write("\ttransition: all 0.4s;\n");
      out.write("}\t\n");
      out.write(".social-btn .btn:first-child {\n");
      out.write("\tmargin-left: 0;\n");
      out.write("}\n");
      out.write(".social-btn .btn:hover {\n");
      out.write("\topacity: 0.8;\n");
      out.write("}\n");
      out.write(".social-btn .btn-primary {\n");
      out.write("\tbackground: #507cc0;\n");
      out.write("}\n");
      out.write(".social-btn .btn-info {\n");
      out.write("\tbackground: #64ccf1;\n");
      out.write("}\n");
      out.write(".social-btn .btn-danger {\n");
      out.write("\tbackground: #df4930;\n");
      out.write("}\n");
      out.write(".social-btn .btn i {\n");
      out.write("\tfont-size: 20px;\n");
      out.write("}\n");
      out.write(".text-danger__style {\n");
      out.write("    text-align: center;\n");
      out.write("    color: red;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("    <span style=\"color:red\">");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("<div class=\"signin-form\" id=\"logreg-forms\" action=\"signup\" method=\"post\" class=\"form-signup\">\n");
      out.write("    <form class=\"form-signin\" action=\"signup\" method=\"post\">\n");
      out.write("\t\t<h2>Sign up</h2>\n");
      out.write("        <p class=\"hint-text\">Sign Up with your social media account</p>\n");
      out.write("\t\t<div class=\"social-btn text-center\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"btn btn-primary btn-lg\" title=\"Facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"btn btn-info btn-lg\" title=\"Twitter\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"btn btn-danger btn-lg\" title=\"Google\"><i class=\"fa fa-google\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"or-seperator\"><b>or</b></div>\n");
      out.write("        <p  class=\"text-danger__style\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        \t<input type=\"text\" class=\"form-control input-lg\" name=\"user\" id=\"inputUser\" autofocus=\"\" placeholder=\"Username\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("            <input type=\"password\" class=\"form-control input-lg\" name=\"pass\" id=\"inputPassword\" placeholder=\"Password\" required=\"required\">\n");
      out.write("        </div>  \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("            <input name=\"repass\" type=\"password\" id=\"inputPassword2nd\" required autofocus=\"\" class=\"form-control input-lg\"  placeholder=\"ConfirmPassword\" required=\"required\">\n");
      out.write("        </div>  \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control input-lg\" name=\"pass\" id=\"inputEmailAddress\" placeholder=\"Email address\" required=\"required\">\n");
      out.write("        </div> \n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("            <input name=\"repass\" type=\"text\" id=\"phoneNumber\" required autofocus=\"\" class=\"form-control input-lg\"  placeholder=\"PhoneNumber\" required=\"required\">\n");
      out.write("        </div>  \n");
      out.write("                \n");
      out.write("                \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success btn-lg btn-block signin-btn\">Sign Up</button>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success btn-lg btn-block signin-btn\"><a  href=\"Login.jsp\">Back</a></button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.rawgit.com/PascaleBeier/bootstrap-validate/v2.2.5/dist/bootstrap-validate.js\" ></script>\n");
      out.write("           <script>\n");
      out.write("                 bootstrapValidate('#inputUser','min:6:UserName too short')\n");
      out.write("                 bootstrapValidate('#inputUser','max:15:UserName too long')\n");
      out.write("                 bootstrapValidate('#inputPassword','min:6:Password minimum 6 characters')\n");
      out.write("                 bootstrapValidate('#inputPassword','max:30:Password maximum 30 characters')\n");
      out.write("                 bootstrapValidate('#inputPassword','regex:^[a-zA-Z0-9]+$:Cannot use special characters')\n");
      out.write("                 bootstrapValidate('#inputPassword2nd','matches:#inputPassword: You password should be mathches!')\n");
      out.write("//                 bootstrapValidate('#inputEmailAddress','email: Enter a valid email address')\n");
      out.write("                 bootstrapValidate('#inputEmailAddress','regex:^[a-z0-9._%+-]+@gmail.com+$|regex:^[a-z0-9._%+-]+@yahoo.com+$:Cannot use special characters')\n");
      out.write("                 bootstrapValidate('#inputEmailAddress','min:12:Email minimum 12 characters')\n");
      out.write("                  bootstrapValidate('#inputEmailAddress','max:30:Email maximum 30 characters')\n");
      out.write("                 bootstrapValidate('#phoneNumber','numeric: Please enter numeric characters')\n");
      out.write("           </script>\n");
      out.write("        <script>\n");
      out.write("            function toggleResetPswd(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                $('#logreg-forms .form-signin').toggle() // display:block or none\n");
      out.write("                $('#logreg-forms .form-reset').toggle() // display:block or none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function toggleSignUp(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                $('#logreg-forms .form-signin').toggle(); // display:block or none\n");
      out.write("                $('#logreg-forms .form-signup').toggle(); // display:block or none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(() => {\n");
      out.write("                // Login Register Form\n");
      out.write("                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);\n");
      out.write("                $('#logreg-forms #cancel_reset').click(toggleResetPswd);\n");
      out.write("                $('#logreg-forms #btn-signup').click(toggleSignUp);\n");
      out.write("                $('#logreg-forms #cancel_signup').click(toggleSignUp);\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
