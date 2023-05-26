package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"\" >\n");
      out.write("        <div class=\"py-5 text-center\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"mx-auto col-lg-6 col-10\">\n");
      out.write("\n");
      out.write("                        ");

                            if (request.getAttribute("theMessage") != null) {
                                String message = (String) request.getAttribute("theMessage");
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert(\"" + message + "\")");
                                out.println("</script>");
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form action=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"command\" value=\"ADDCUSTOMER\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <h1>Sign Up Here&nbsp;</h1>\n");
      out.write("                            <p class=\"mb-3\">Book Your Lorry Today !<br></p>\n");
      out.write("                            <form class=\"text-left\">\n");
      out.write("                                <div class=\"form-group\"> <label for=\"form16\">Email</label> <input type=\"text\" name=\"cusEmail\" class=\"form-control\" id=\"form16\"> </div>\n");
      out.write("                                <div class=\"form-group\"> <label for=\"form17\">Password</label> <input type=\"password\" name=\"cusPassword\" class=\"form-control\" id=\"form17\"> </div>\n");
      out.write("                                <div class=\"form-group\"> <label for=\"form18\">Re-Enter Password</label> <input type=\"password\" name=\"cusPassword2\" class=\"form-control\" id=\"form18\"> </div>\n");
      out.write("                                <div class=\"form-row\">\n");
      out.write("                                    <div class=\"form-group col-md-6\"> <label for=\"form19\">Name</label> <input type=\"text\" name=\"cusName\" class=\"form-control\" id=\"form19\"> </div>\n");
      out.write("                                    <div class=\"form-group col-md-6\"> <label for=\"form20\">Ic Number</label> <input type=\"text\" name=\"cusIc\" class=\"form-control\" id=\"form20\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <div> <input<label>If you already have an account , <a href=\"login.jsp\">click here</a></label> </div>\n");
      out.write("                                </div> <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("                            </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("    </body>\n");
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
