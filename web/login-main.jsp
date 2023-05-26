<%-- 
    Document   : login-main
    Created on : May 3, 2019, 10:36:48 AM
    Author     : ASUS
--%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
    </head>

    <body>
        <div class="py-5" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;" >
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
                            String cusName = "";
                            String cusId = "";
                            try {
                                cusName = (String) request.getAttribute("cusName");
                                cusId = (String) request.getAttribute("cusId");
                            } catch (Exception e) {
                            }
                        %>

                        <h1>Lorry Reservation System</h1>
                        <h5 class="">Welcome <%=cusName%></h5>
                        <a class="btn btn-outline-dark w-25" href="login.jsp">Sign Out</a>
                    </div>
                </div>

                <%
                    session.setAttribute("cusId", cusId);
                    session.setAttribute("cusName", cusName);
                %>

                <div class="row">
                    <div class="col-lg-4 col-6 p-3">
                        <div class="card"> <img class="card-img-top" src="https://static.pingendo.com/img-placeholder-1.svg" alt="Card image cap">
                            <div class="card-body"><a class="btn btn-outline-dark w-100" href="<%=request.getContextPath()%>/BookingServlet?cusId=<%=cusId%>">Manage Profile</a></div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-6 p-3">
                        <div class="card"> <img class="card-img-top" src="https://static.pingendo.com/img-placeholder-4.svg" alt="Card image cap">
                            <div class="card-body"><a class="btn btn-outline-dark w-100" href="<%=request.getContextPath()%>/BookingServlet?lorryCusId=<%=cusId%>">Manage Lorry</a></div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-6 p-3">
                        <div class="card"> <img class="card-img-top" src="https://static.pingendo.com/img-placeholder-3.svg" alt="Card image cap">
                            <div class="card-body"><a class="btn btn-outline-dark w-100" href="<%=request.getContextPath()%>/BookingServlet?command=LISTBOOKING&lorryCusId=<%=cusId%>">Booking Details</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>

</html>
