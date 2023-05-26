<%-- 
    Document   : view-customer
    Created on : May 21, 2019, 10:01:54 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            if (request.getAttribute("theMessage") != null) {
                                String message = (String) request.getAttribute("theMessage");
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert(\"" + message + "\")");
                                out.println("</script>");
                            }

                            String cusEmail = (String) request.getAttribute("cusEmail");
                            String cusPassword = (String) request.getAttribute("cusPassword");
                            String cusName = (String) request.getAttribute("cusName");
                            String cusIc = (String) request.getAttribute("cusIc");
                            String cusId = (String) request.getAttribute("cusId");


                        %>
                        <form action="<%=request.getContextPath()%>/BookingServlet" method="POST">
                            <input type="hidden" name="command" value="UPDATECUSTOMER"/>
                            <input type="hidden" name="cusId" value="<%=cusId%>"/>
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
                    <div class="mx-auto col-md-8 text-center">
                        <h1 class="">Update Profile</h1>
                        <div class="row">
                            <div class="col-md-12">
                                <form id="c_form-h" class="">
                                    <div class="form-group row"> <label class="col-2">E-mail</label>
                                        <div class="col-10">
                                            <input type="text" class="form-control" name="cusEmail" value="<%=cusEmail%>"> </div>
                                    </div>
                                    <div class="form-group row"> <label class="col-2">Password</label>
                                        <div class="col-10">
                                            <input type="password" class="form-control" name="cusPassword" value="<%=cusPassword%>" ></div>
                                    </div>
                                    <div class="form-group row"><label class="col-2">Re-Enter Password</label>
                                        <div class="col-10">
                                            <input type="password" class="form-control" name="cusPassword2"> </div>
                                    </div>
                                    <div class="form-group row"><label class="col-2">First and Last Name</label>
                                        <div class="col-10">
                                            <input type="text" class="form-control" name="cusName" value="<%=cusName%>"></div>
                                    </div>
                                    <div class="form-group row"><label class="col-2">Ic Number</label>
                                        <div class="col-10">
                                            <input type="text" class="form-control" name="cusIc" value="<%=cusIc%>"></div>
                                    </div><button type="submit" class="btn btn-primary">Update</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="py-5 h-25" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;"></div>
        <div class="py-5" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;"></div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous" style=""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous" style=""></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous" style=""></script>
    </body>

</html>
