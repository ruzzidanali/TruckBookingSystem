package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user.Lorry;
import java.util.ArrayList;

public final class view_002dlorry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"\">\n");
      out.write("        <div class=\"py-5 h-25\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"mx-auto col-md-8 text-center\">\n");
      out.write("                        ");

                            if (request.getAttribute("theMessage") != null) {
                                String message = (String) request.getAttribute("theMessage");
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert(\"" + message + "\")");
                                out.println("</script>");
                            }

                            ArrayList<Lorry> allLorry = (ArrayList) request.getAttribute("allLorry");
                            String cusName = (String) session.getAttribute("cusName");
                            String cusId = (String) request.getAttribute("cusId");


                        
      out.write("\n");
      out.write("                        <h1>Lorry Reservation System</h1>\n");
      out.write("                        <p class=\"mb-4\">Welcome ");
      out.print(cusName);
      out.write("</p><a class=\"btn btn-outline-dark w-25\" href=\"login.jsp\">Sign Out</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"py-5 h-25\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 h-100\"><a class=\"btn btn-info w-100\" href=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet?cusId=");
      out.print(cusId);
      out.write("\">Manage Profile</a></div>\n");
      out.write("                    <div class=\"col-md-4\"><a class=\"btn btn-info w-100\" href=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet?lorryCusId=");
      out.print(cusId);
      out.write("\">Manage Lorry</a></div>\n");
      out.write("                    <div class=\"col-md-4\"><a class=\"btn btn-info w-100\" href=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet?command=LISTBOOKING&lorryCusId=");
      out.print(cusId);
      out.write("\">Booking Details</a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"mx-auto col-md-8 text-center\">\n");
      out.write("                                <h1>Your Lorry Information</h1>\n");
      out.write("                                ");
if (allLorry.size() == 0) {
      out.write("\n");
      out.write("                                <form action=\"register-lorry.jsp\">\n");
      out.write("                                    <p class=\"mb-4\">No Lorry has been booked yet&nbsp;</p>\n");
      out.write("                                    <input type=\"submit\" value=\"Add New Vehicle\" class=\"btn btn-outline-dark w-25\" >\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        <form action=\"register-lorry.jsp\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"table-wrap\">\n");
      out.write("                        <table class=\"table table-bordered table-dark table-hover\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Lorry Type</th>\n");
      out.write("                                    <th>Function</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>Remarks</th>\n");
      out.write("                                    <th>Actions</th>\n");
      out.write("                                </tr>\n");
      out.write("                            <script>\n");
      out.write("                                function confirmDelete() {\n");
      out.write("                                    return confirm(\"Are you sure you want to delete?\");\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                            ");
  for (int i = 0; i < allLorry.size(); i++) {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(allLorry.get(i).getLorryType());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(allLorry.get(i).getLorryFunc());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(allLorry.get(i).getLorryPrice());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(allLorry.get(i).getLorryRemarks());
      out.write("</td>\n");
      out.write("                                <td><a href=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet?UlorryId=");
      out.print(allLorry.get(i).getLorryId());
      out.write("\">Update</a> | <a href=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet?DlorryId=");
      out.print(allLorry.get(i).getLorryId());
      out.write("\" onclick=\"return confirmDelete()\">Delete</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        </center>\n");
      out.write("                        <p><center><input type=\"submit\" value=\"Add New Lorry\" class=\"btn btn-outline-dark w-25\" ></center><p/>\n");
      out.write("                        </form>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <div class=\"py-5 h-25\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\"></div>\n");
      out.write("                        <div class=\"py-5\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\"></div>\n");
      out.write("                        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("                        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("                        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("                        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("                        <script src=\"js/popper.js\"></script>\n");
      out.write("                        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("                        <script src=\"js/main.js\"></script>\n");
      out.write("                        </body>\n");
      out.write("\n");
      out.write("                        </html>\n");
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
