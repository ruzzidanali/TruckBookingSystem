<%-- 
    Document   : index
    Created on : 20 Jun 2022, 3:16:08 am
    Author     : HP
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
        <div class="py-5 text-center">
            <div class="container">
                <div class="row">
                    <div class="mx-auto col-lg-6 col-10">

                        <%
                            if (request.getAttribute("theMessage") != null) {
                                String message = (String) request.getAttribute("theMessage");
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert(\"" + message + "\")");
                                out.println("</script>");
                            }
                        %>



                        <form action="<%=request.getContextPath()%>/BookingServlet" method="POST">
                            <input type="hidden" name="command" value="ADDCUSTOMER"/>


                            <h1>Sign Up Here&nbsp;</h1>
                            <p class="mb-3">Book Your Lorry Today !<br></p>
                            <form class="text-left">
                                <div class="form-group"> <label for="form16">Email</label> <input type="text" name="cusEmail" class="form-control" id="form16"> </div>
                                <div class="form-group"> <label for="form17">Password</label> <input type="password" name="cusPassword" class="form-control" id="form17"> </div>
                                <div class="form-group"> <label for="form18">Re-Enter Password</label> <input type="password" name="cusPassword2" class="form-control" id="form18"> </div>
                                <div class="form-row">
                                    <div class="form-group col-md-6"> <label for="form19">Name</label> <input type="text" name="cusName" class="form-control" id="form19"> </div>
                                    <div class="form-group col-md-6"> <label for="form20">Ic Number</label> <input type="text" name="cusIc" class="form-control" id="form20"> </div>
                                </div>
                                <div>
                                    <div> <input<label>If you already have an account , <a href="login.jsp">click here</a></label> </div>
                                </div> <button type="submit" class="btn btn-primary">Sign in</button>
                            </form>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous" style=""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous" style=""></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous" style=""></script>
    </body>

</html>
