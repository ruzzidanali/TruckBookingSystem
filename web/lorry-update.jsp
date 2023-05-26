<%-- 
    Document   : vehicle-update
    Created on : 20 Jun 2022, 3:18:25 am
    Author     : HP
--%>

<%@page import="user.Lorry"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
    </head>

    <body class="">
        <div class="py-5 h-25" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;">
            <div class="container">
                <div class="row">
                    <div class="mx-auto col-md-8 text-center" style="">
                        <%
                            String cusId = (String) session.getAttribute("cusId");
                            String cusName = (String) session.getAttribute("cusName");
                            Lorry lorry = (Lorry) request.getAttribute("lorry");

                        %>

                        <form action="<%=request.getContextPath()%>/BookingServlet" method="POST">
                            <input type="hidden" name="command" value="UPDATELORRY"/>
                            <input type="hidden" name="cusId" value="<%=cusId%>"/>
                            <input type="hidden" name="lorryId" value="<%=lorry.getLorryId()%>"/>
                            <h1>Lorry Reservation System</h1>
                            <p class="mb-4">Welcome <%=cusName%>;</p><a class="btn btn-outline-dark w-25" href="login.jsp">Sign Out</a>
                    </div>
                </div>
                <div class="row">
                    <div class="mx-auto p-4 col-lg-7" style="">
                        <form style="">
                            <h1 class="text-center" style="">Update your booking</h1>

                            <%
                                if (lorry.getLorryType().equals("Box Van")) {
                            %>
                            <div class="form-group"><label>Lorry Type</label><select name="lorryType" class="form-control" >
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="Box Van">Box Van</option>
                                    <option value="Canvas and Frame">Canvas and Frame</option>
                                    <option value="Curtain Sider">Curtain Sider</option>
                                </select>
                            </div>
                            <%
                            } else if (lorry.getLorryType().equals("Canvas and Frame")) {
                            %>
                            <div class="form-group"><label>Lorry Type</label><select name="lorryType" class="form-control" >
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="Box Van">Box Van</option>
                                    <option value="Canvas and Frame">Canvas and Frame</option>
                                    <option value="Curtain Sider">Curtain Sider</option>
                                </select>
                            </div>
                            <%
                            } else if (lorry.getLorryType().equals("Curtain Sider")) {
                            %>
                            <div class="form-group"><label>Lorry Type</label><select name="lorryType" class="form-control" >
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="Box Van">Box Van</option>
                                    <option value="Canvas and Frame">Canvas and Frame</option>
                                    <option value="Curtain Sider">Curtain Sider</option>
                                </select>
                            </div>
                            <%
                                }
                            %>
                            </tr>
                            <tr>
                                <%
                                    if (lorry.getLorryFunc().equals("Moving House")) {
                                %>
                            <div class="form-group"><label>Lorry Function</label><select name="lorryFunc" class="form-control">
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="Moving House">Moving House</option>
                                    <option value="Deliveries">Deliveries</option>

                                </select>
                            </div> 
                            <%
                            } else if (lorry.getLorryFunc().equals("Deliveries")) {
                            %>
                            <div class="form-group"><label>Lorry Function</label><select name="lorryFunc" class="form-control">
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="Moving House">Moving House</option>
                                    <option value="Deliveries">Deliveries</option>

                                </select>
                            </div> 
                            <%
                                }
                            %>
                            </tr>
                            <tr>
                                <%
                                    if (lorry.getLorryPrice().equals("RM150")) {
                                %>
                            <div class="form-group"><label>Price</label><select name="lorryPrice" class="form-control">
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="RM150">RM150 1 tan</option>
                                    <option value="RM240">RM240 3 tan</option>
                                    <option value="RM340">RM340 6 tan</option>
                                    <option value="RM650">RM650 10 tan</option>
                                </select>
                            </div>
                            <%
                            } else if (lorry.getLorryPrice().equals("RM240")) {
                            %>
                            <div class="form-group"><label>Price</label><select name="lorryPrice" class="form-control">
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="RM150">RM150 1 tan</option>
                                    <option value="RM240">RM240 3 tan</option>
                                    <option value="RM340">RM340 6 tan</option>
                                    <option value="RM650">RM650 10 tan</option>
                                </select>
                            </div>
                            <%
                            } else if (lorry.getLorryPrice().equals("RM340")) {
                            %>
                            <div class="form-group"><label>Price</label><select name="lorryPrice" class="form-control">
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="RM150">RM150 1 tan</option>
                                    <option value="RM240">RM240 3 tan</option>
                                    <option value="RM340">RM340 6 tan</option>
                                    <option value="RM650">RM650 10 tan</option>
                                </select>
                            </div>
                            <%
                            } else if (lorry.getLorryPrice().equals("RM650")) {
                            %>
                            <div class="form-group"><label>Price</label><select name="lorryPrice" class="form-control">
                                    <option selected="" value="Open this select menu">Open this select menu</option>
                                    <option value="RM150">RM150 1 tan</option>
                                    <option value="RM240">RM240 3 tan</option>
                                    <option value="RM340">RM340 6 tan</option>
                                    <option value="RM650">RM650 10 tan</option>
                                </select>
                            </div>
                            <%
                                }
                            %>
                            </tr>

                            <div class="form-group"><label>Remarks</label><textarea name="lorryRemarks" class="form-control"></textarea>
                            </div>
                            <tr><td><input type="hidden" name="cusId" value="<%=cusId%>"</td></tr>

                            </table></center>
                            <br>
                            <div class="row">
                                <div class="col-md-12 text-center"><input type="submit" class="btn text-center w-25 btn-dark" value="Update Vehicle"/><input type="reset" class="btn text-center w-25 btn-dark" value="Cancel" onclick="window.location.href = '<%=request.getContextPath()%>/BookingServlet?command=LISTLORRY&lorryCusId=<%=cusId%>'"/></div>
                            </div>

                    </div>
                </div>
                <div class="h-50" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;">
                    <div class="container">
                    </div>
                </div>
                <div class="h-50" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;">
                    <div class="container">
                    </div>
                </div>
                <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous" style=""></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous" style=""></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous" style=""></script>
                </form> 
                </body>
                </html>



