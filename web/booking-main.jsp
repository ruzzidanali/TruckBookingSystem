<%-- 
    Document   : insurance-main
    Created on : 20 Jun 2022, 3:16:38 am
    Author     : HP
--%>

<%@page import="user.Lorry"%>
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

    <body class="" >
        <div class="py-5 h-25" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-position: right bottom; background-size: cover; background-repeat: repeat; background-attachment: fixed;">
            <div class="container">
                <div class="row">
                    <div class="mx-auto col-md-8 text-center">
                        <%
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

                        %>
                        <form action="<%=request.getContextPath()%>/BookingServlet" method="POST">
                            <input type="hidden" name="command" value="LOADBOOKING"/>
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
                    <form style="">
                        <h1 class="text-center" style="" >Date & Address Selection</h1>
                        <div class="form-group"><label >Select Your Lorry</label><select name="lorryType" class="form-control">
                                <option selected="" value="Open this select menu">Open this select menu</option>
                                <%
                                    for (int j = 0; j < typeList.length; j++) {
                                %>
                                <option value="<%=typeList[j]%>"><%=typeList[j]%></option>
                                <%}%>
                            </select>
                        </div>
                            <div class="form-group"><label>Date</label><br>
                                <input type="date" id="date" name="date">
                        </div>
                        <div class="form-group"><label>Address</label><textarea name="address" class="form-control"></textarea>
                        </div>

                        <div class="form-group"><label>Price</label><select name="lorryPrice" class="form-control">
                                <option selected="" value="Open this select menu">Open this select menu</option>
                                <%
                                    for (int k = 0; k < typeList.length; k++) {
                                %>
                                <option value="<%=priceList[k]%>"><%=priceList[k]%></option>
                                <%}%>
                            </select>
                        </div>
                        <div class="form-group"><label>Lorry Function</label><select name="lorryFunc" class="form-control">
                                <option selected="" value="Open this select menu">Open this select menu</option>
                                <%
                                    for (int p = 0; p < typeList.length; p++) {
                                %>
                                <option value="<%=funcList[p]%>"><%=funcList[p]%></option>
                                <%}%>
                            </select>
                        </div>
                        <div class="form-group"><label>Remarks</label><select name="lorryRemarks" class="form-control">
                                <option selected="" value="Open this select menu">Open this select menu</option>
                            <%
                                for (int m = 0; m < typeList.length; m++) {
                            %>
                            <option value="<%=remarksList[m]%>"><%=remarksList[m]%></option>
                            <%}%>
                            </select>
                        </div>
                        </tr>
                        <br>
                        </table></center>
                        <br>
                        <center>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Get Booking Details"/></center>
                        </fieldset>
                        </fieldset>
                    </form>
                    </body>
                    </html>
