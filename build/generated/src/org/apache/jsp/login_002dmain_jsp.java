package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class login_002dmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"py-5\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"mx-auto col-md-8 text-center\">\n");
      out.write("\n");
      out.write("                        ");

                            if (request.getAttribute("theMessage") != null) {
                                String message = (String) request.getAttribute("theMessage");
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert(\"" + message + "\")");
                                out.println("</script>");
                            }
                            String cusName = "";
                            String cusId = "";
                            try {
                                cusName = (String) request.getAttribute("cusName");
                                cusId = (String) request.getAttribute("cusId");
                            } catch (Exception e) {
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <h1>Lorry Reservation System</h1>\n");
      out.write("                        <h5 class=\"\">Welcome ");
      out.print(cusName);
      out.write("</h5>\n");
      out.write("                        <a class=\"btn btn-outline-dark w-25\" href=\"login.jsp\">Sign Out</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    session.setAttribute("cusId", cusId);
                    session.setAttribute("cusName", cusName);
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-6 p-3\">\n");
      out.write("                        <div class=\"card\"> <img class=\"card-img-top\" src=\"https://static.pingendo.com/img-placeholder-1.svg\" alt=\"Card image cap\">\n");
      out.write("                            <div class=\"card-body\"><a class=\"btn btn-outline-dark w-100\" href=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet?cusId=");
      out.print(cusId);
      out.write("\">Manage Profile</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-6 p-3\">\n");
      out.write("                        <div class=\"card\"> <img class=\"card-img-top\" src=\"https://static.pingendo.com/img-placeholder-4.svg\" alt=\"Card image cap\">\n");
      out.write("                            <div class=\"card-body\"><a class=\"btn btn-outline-dark w-100\" href=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet?lorryCusId=");
      out.print(cusId);
      out.write("\">Manage Lorry</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-6 p-3\">\n");
      out.write("                        <div class=\"card\"> <img class=\"card-img-top\" src=\"https://static.pingendo.com/img-placeholder-3.svg\" alt=\"Card image cap\">\n");
      out.write("                            <div class=\"card-body\"><a class=\"btn btn-outline-dark w-100\" href=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet?command=LISTBOOKING&lorryCusId=");
      out.print(cusId);
      out.write("\">Booking Details</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
