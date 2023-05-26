package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user.Lorry;
import java.util.List;

public final class booking_002dmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"\" >\n");
      out.write("        <div class=\"py-5 h-25\" style=\"background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"mx-auto col-md-8 text-center\">\n");
      out.write("                        ");

                            String cusName = (String) session.getAttribute("cusName");
                            String cusID = (String) session.getAttribute("cusId");
                            int cusId = Integer.parseInt(cusID);

                            List<Lorry> allLorry = (List<Lorry>) request.getAttribute("allLorry");
                            String typeList[] = new String[allLorry.size()];
                            String priceList[] = new String[allLorry.size()];
                            String funcList[] = new String[allLorry.size()];
                            String remarksList[] = new String[allLorry.size()];
                            for (int i = 0; i < allLorry.size(); i++) {
                                typeList[i] = allLorry.get(i).getLorryType();
                                priceList[i] = allLorry.get(i).getLorryPrice();
                                funcList[i] = allLorry.get(i).getLorryFunc();
                                remarksList[i] = allLorry.get(i).getLorryRemarks();
                            }

                        
      out.write("\n");
      out.write("                        <form action=\"");
      out.print(request.getContextPath());
      out.write("/BookingServlet\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"command\" value=\"LOADBOOKING\"/>\n");
      out.write("                            <h1>Lorry Reservation System</h1>\n");
      out.write("                            <p class=\"mb-4\">Welcome ");
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
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"mx-auto p-4 col-lg-7\" style=\"\">\n");
      out.write("                    <form style=\"\">\n");
      out.write("                        <h1 class=\"text-center\" style=\"\" >Date & Address Selection</h1>\n");
      out.write("                        <div class=\"form-group\"><label >Select Your Lorry</label><select name=\"lorryType\" class=\"form-control\">\n");
      out.write("                                <option selected=\"\" value=\"Open this select menu\">Open this select menu</option>\n");
      out.write("                                ");

                                    for (int j = 0; j < typeList.length; j++) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(typeList[j]);
      out.write('"');
      out.write('>');
      out.print(typeList[j]);
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"form-group\"><label>Date</label><br>\n");
      out.write("                                <input type=\"date\" id=\"date\" name=\"date\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\"><label>Address</label><textarea name=\"address\" class=\"form-control\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\"><label>Price</label><select name=\"lorryPrice\" class=\"form-control\">\n");
      out.write("                                <option selected=\"\" value=\"Open this select menu\">Open this select menu</option>\n");
      out.write("                                ");

                                    for (int k = 0; k < typeList.length; k++) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(priceList[k]);
      out.write('"');
      out.write('>');
      out.print(priceList[k]);
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\"><label>Lorry Function</label><select name=\"lorryFunc\" class=\"form-control\">\n");
      out.write("                                <option selected=\"\" value=\"Open this select menu\">Open this select menu</option>\n");
      out.write("                                ");

                                    for (int p = 0; p < typeList.length; p++) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(funcList[p]);
      out.write('"');
      out.write('>');
      out.print(funcList[p]);
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\"><label>Remarks</label><select name=\"lorryRemarks\" class=\"form-control\">\n");
      out.write("                                <option selected=\"\" value=\"Open this select menu\">Open this select menu</option>\n");
      out.write("                            ");

                                for (int m = 0; m < typeList.length; m++) {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(remarksList[m]);
      out.write('"');
      out.write('>');
      out.print(remarksList[m]);
      out.write("</option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        </tr>\n");
      out.write("                        <br>\n");
      out.write("                        </table></center>\n");
      out.write("                        <br>\n");
      out.write("                        <center>&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" value=\"Get Booking Details\"/></center>\n");
      out.write("                        </fieldset>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
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
