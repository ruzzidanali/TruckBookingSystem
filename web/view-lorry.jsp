<%-- 
    Document   : view-vehicle
    Created on : 20 Jun 2022, 3:19:14 am
    Author     : HP
--%>

<%@page import="user.Lorry"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
        <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/style.css">


    </head>

    <body class="">
        <div class="py-5 h-25" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;">
            <div class="container">
                <div class="row">
                    <div class="mx-auto col-md-8 text-center">
                        <%
                            if (request.getAttribute("theMessage") != null) {
                                String message = (String) request.getAttribute("theMessage");
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert(\"" + message + "\")");
                                out.println("</script>");
                            }

                            ArrayList<Lorry> allLorry = (ArrayList) request.getAttribute("allLorry");
                            String cusName = (String) session.getAttribute("cusName");
                            String cusId = (String) request.getAttribute("cusId");


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
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="row">
                            <div class="mx-auto col-md-8 text-center">
                                <h1>Your Lorry Information</h1>
                                <%if (allLorry.size() == 0) {%>
                                <form action="register-lorry.jsp">
                                    <p class="mb-4">No Lorry has been booked yet&nbsp;</p>
                                    <input type="submit" value="Add New Vehicle" class="btn btn-outline-dark w-25" >
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%} else {%>
        <form action="register-lorry.jsp">
            <div class="row">
                <div class="col-md-12">
                    <div class="table-wrap">
                        <table class="table table-bordered table-dark table-hover">
                            <thead>
                                <tr>
                                    <th>Lorry Type</th>
                                    <th>Function</th>
                                    <th>Price</th>
                                    <th>Remarks</th>
                                    <th>Actions</th>
                                </tr>
                            <script>
                                function confirmDelete() {
                                    return confirm("Are you sure you want to delete?");
                                }
                            </script>
                            <%  for (int i = 0; i < allLorry.size(); i++) {%>
                            <tr>
                                <td><%=allLorry.get(i).getLorryType()%></td>
                                <td><%=allLorry.get(i).getLorryFunc()%></td>
                                <td><%=allLorry.get(i).getLorryPrice()%></td>
                                <td><%=allLorry.get(i).getLorryRemarks()%></td>
                                <td><a href="<%=request.getContextPath()%>/BookingServlet?UlorryId=<%=allLorry.get(i).getLorryId()%>">Update</a> | <a href="<%=request.getContextPath()%>/BookingServlet?DlorryId=<%=allLorry.get(i).getLorryId()%>" onclick="return confirmDelete()">Delete</a></td>
                            </tr>
                            <%}%>
                        </table>

                        </center>
                        <p><center><input type="submit" value="Add New Lorry" class="btn btn-outline-dark w-25" ></center><p/>
                        </form>
                        <%}%>
                        <div class="py-5 h-25" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;"></div>
                        <div class="py-5" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;"></div>
                        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous" style=""></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous" style=""></script>
                        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous" style=""></script>
                        <script src="js/jquery.min.js"></script>
                        <script src="js/popper.js"></script>
                        <script src="js/bootstrap.min.js"></script>
                        <script src="js/main.js"></script>
                        </body>

                        </html>
