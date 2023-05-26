package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"py-5 bg-light\" >\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"p-5 col-md-7 d-flex flex-column justify-content-center\" style=\"\">\n");
      out.write("            \n");
      out.write("        ");

            if (request.getAttribute("theMessage") != null) {
                String message = (String) request.getAttribute("theMessage");
                out.println("<script type=\"text/javascript\">");
                out.println("alert(\"" + message + "\")");
                out.println("</script>");
            }
        
      out.write("\n");
      out.write("        <form action=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet\" method=\"POST\">\n");
      out.write("            <input type=\"hidden\" name=\"command\" value=\"VERIFYCUSTOMER\"/>\n");
      out.write("\n");
      out.write("            <h3 class=\"display-4 mb-3\">Lorry Reservation System</h3>\n");
      out.write("            <p class=\"mb-4 lead\">Welcome to Lorry Reservation System. <br> Here you can make a lorry reservation for moving house, deliveries and others.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"p-5 col-md-5\" style=\"\">\n");
      out.write("          <h3 class=\"mb-3\">Login Here</h3>\n");
      out.write("          <form style=\"\">\n");
      out.write("            <div class=\"form-group\"> <label>Email</label> <input class=\"form-control\" type=\"text\" name=\"cusEmail\" placeholder=\"Type here\"> </div>\n");
      out.write("            <div class=\"form-group\"><label>Password</label><input class=\"form-control\" type=\"password\" name=\"cusPassword\" placeholder=\"Type here\"></div>\n");
      out.write("            <button type=\"submit\" class=\"btn mt-4 btn-block btn-outline-dark p-2\"><b>Login</b></button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
}
