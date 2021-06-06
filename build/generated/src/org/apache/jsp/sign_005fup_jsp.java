package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hibernate.Customer;

public final class sign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"login\">\n");
      out.write("    <input class=\"f\" type=\"file\" id=\"f\" name=\"f\" accept=\"image/*\"/>\n");
      out.write("    <button for=\"f\" onclick=\"uploadImg();\" class=\"btn btn-outline-info btn-sm\">Upload Profile Picture</button>>\n");
      out.write("    <img id=\"i\" class=\"profile-icon\" src=\"homepage_img/user.png\"/>\n");
      out.write("    <br/>\n");
      out.write("    \n");
      out.write("    <span>E-mail</span>\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"text\" id=\"username\"/>\n");
      out.write("    <br/>\n");
      out.write("    <span>First Name</span>\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"text\" id=\"fname\"/>\n");
      out.write("    <br/>\n");
      out.write("    <span>Last Name</span>\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"text\" id=\"lname\"/>\n");
      out.write("    <br/>\n");
      out.write("    <span>Mobile</span>\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"text\" id=\"mobile\"/>\n");
      out.write("    <br/>\n");
      out.write("    <span>Password</span>\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"password\" id=\"password\"/>\n");
      out.write("    <br/><br/>\n");
      out.write("    <div class=\"ml-auto mr-auto\">\n");
      out.write("        <button class=\"btn btn-outline-success btn-sm mr-auto\" onclick=\"signUp(); isEmail();\">Sign Up</button>\n");
      out.write("        <button class=\"btn btn-outline-danger btn-sm ml-auto\" onclick=\"checkSignIn();\">Cancel</button>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
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
