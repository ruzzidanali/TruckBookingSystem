package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_002dlorry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body class=\"\">\n");
      out.write("        <div class=\"py-5 h-25\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"mx-auto col-md-8 text-center\" style=\"\">\n");
      out.write("                        ");

                            String cusId = (String) session.getAttribute("cusId");
                            String cusName = (String) session.getAttribute("cusName");
                        
      out.write("\n");
      out.write("                        <form action=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"command\" value=\"ADDLORRY\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"cusId\" value=\"");
      out.print(cusId);
      out.write("\"/>\n");
      out.write("                            <h1>Lorry Reservation System</h1>\n");
      out.write("                            <p class=\"mb-4\">Welcome ");
      out.print(cusName);
      out.write(";</p><a class=\"btn btn-outline-dark w-25\" href=\"login.jsp\">Sign Out</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"mx-auto p-4 col-lg-7\" style=\"\">\n");
      out.write("                        <form style=\"\">\n");
      out.write("                            <h1 class=\"text-center\" style=\"\">Book your lorry</h1>\n");
      out.write("                            <div class=\"form-group\"><label>Lorry Type</label><select name=\"lorryType\" class=\"form-control\" >\n");
      out.write("                                    <option selected=\"\" value=\"Open this select menu\">Open this select menu</option>\n");
      out.write("                                    <option value=\"Box Van\">Box Van</option>\n");
      out.write("                                    <option value=\"Canvas and Frame\">Canvas and Frame</option>\n");
      out.write("                                    <option value=\"Curtain Sider\">Curtain Sider</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\"><label>Lorry Function</label><select name=\"lorryFunc\" class=\"form-control\">\n");
      out.write("                                    <option selected=\"\" value=\"Open this select menu\">Open this select menu</option>\n");
      out.write("                                    <option value=\"Moving House\">Moving House</option>\n");
      out.write("                                    <option value=\"Deliveries\">Deliveries</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\"><label>Price</label><select name=\"lorryPrice\" class=\"form-control\">\n");
      out.write("                                    <option selected=\"\" value=\"Open this select menu\">Open this select menu</option>\n");
      out.write("                                    <option value=\"RM150\">RM150 1 tan</option>\n");
      out.write("                                    <option value=\"RM240\">RM240 3 tan</option>\n");
      out.write("                                    <option value=\"RM340\">RM340 6 tan</option>\n");
      out.write("                                    <option value=\"RM650\">RM650 10 tan</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\"><label>Remarks</label><textarea name=\"lorryRemarks\" class=\"form-control\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <tr><td><input type=\"hidden\" name=\"cusId\" value=\"");
      out.print(cusId);
      out.write("\"/></td></tr>\n");
      out.write("\n");
      out.write("                            </table></center>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12 text-center\"><input type=\"submit\" class=\"btn text-center w-25 btn-dark\" value=\"Book\"/><input type=\"reset\" class=\"btn text-center w-25 btn-dark\" value=\"Cancel\" onclick=\"window.location.href = '");
      out.print(request.getContextPath());
      out.write("/BookingServlet?command=LISTLORRY&lorryCusId=");
      out.print(cusId);
      out.write("'\"/></div>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"h-50\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"h-50\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("                <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("                <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\" style=\"\"></script>\n");
      out.write("                </form> \n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
