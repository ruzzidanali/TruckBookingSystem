<%-- 
    Document   : get-quotation
    Created on : 20 Jun 2022, 3:15:27 am
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="user.Lorry"%>
<%@page import="user.QueryDAO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
    </head>

    <body class="" >
        <div class="py-5 h-25" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;">
            <div class="container">
                <div class="row">
                    <div class="mx-auto col-md-8 text-center">
                        <%

                            String cusId = (String) session.getAttribute("cusId");
                            String cusName = (String) session.getAttribute("cusName");
                            String lorryType = (String) request.getAttribute("lorryType");
                            String date = (String) request.getAttribute("date");
                            String address = (String) request.getAttribute("address");
                            String lorryFunc = (String) request.getAttribute("lorryFunc");
                            String lorryRemarks = (String) request.getAttribute("lorryRemarks");
                            String lorryPrice = (String) request.getAttribute("lorryPrice");

                        %>

                        <h1>Lorry Reservation System</h1>
                        <p class="mb-4">Welcome <%=cusName%></p><a class="btn btn-outline-dark w-25" href="login.jsp">Sign Out</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="py-5 h-25" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 h-100"><a class="btn btn-info w-100" href="<%=request.getContextPath()%>/BookingServlet?cusId=<%=cusId%>">Manage Profile</a></div>
                    <div class="col-md-4"><a class="btn btn-info w-100" href="<%=request.getContextPath()%>/BookingServlet?lorryCusId=<%=cusId%>">Manage Lorry</a></div>
                    <div class="col-md-4"><a class="btn btn-info w-100" href="<%=request.getContextPath()%>/BookingServlet?command=LISTBOOKING&lorryCusId=<%=cusId%>">Booking Details</a></div>
                </div>
            </div>
            <div class="row">
                <div class="mx-auto p-4 col-lg-7" style="">
                    <center><h1 class="text-center" style="" >Reservation Details</h1></center>
                    <center><table>
                            <tr>
                                <td><center><p>Lorry Type:</p></center></td>
                            <td><label></label></td>
                            <td><label></label></td>
                            <td><center><p><%=lorryType%></p></center></td>
                            </tr>
                            <tr>
                                <td><center><p>Date:</p></center></td>
                            <td><label></label></td>
                            <td><label></label></td>
                            <td><center><p><%=date%></p></center></td>
                            </tr>
                            <tr>
                                <td><center><p>Adress:</p></center></td>
                            <td><label></label></td>
                            <td><label></label></td>
                            <td><center><p><%=address%></p></center></td>
                            </tr>
                            <tr>
                                <td><center><p>Price (RM):</p></center></td>
                            <td><label></label></td>
                            <td><label></label></td>
                            <td><center><p><%=lorryPrice%></p></center></td>
                            </tr> 
                            <tr>
                                <td><center><p>Use for:</p></center></td>
                            <td><label></label></td>
                            <td><label></label></td>
                            <td><center><p><%=lorryFunc%></p></center></td>
                            </tr>
                            <tr>
                                <td><center><p>Remarks:</p></center></td>
                            <td><label></label></td>
                            <td><label></label></td>
                            <td><center><p><%=lorryRemarks%></p></center></td>
                            </tr>

                        </table></center>
                </div>
            </div>

    </body>
</html>
