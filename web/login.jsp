<%-- 
    Document   : login
    Created on : 20 Jun 2022, 3:17:32 am
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

<body>
  <div class="py-5 bg-light" >
    <div class="container">
      <div class="row">
        <div class="p-5 col-md-7 d-flex flex-column justify-content-center" style="">
            
        <%
            if (request.getAttribute("theMessage") != null) {
                String message = (String) request.getAttribute("theMessage");
                out.println("<script type=\"text/javascript\">");
                out.println("alert(\"" + message + "\")");
                out.println("</script>");
            }
        %>
        <form action="<%=request.getContextPath()%>/BookingServlet" method="POST">
            <input type="hidden" name="command" value="VERIFYCUSTOMER"/>

            <h3 class="display-4 mb-3">Lorry Reservation System</h3>
            <p class="mb-4 lead">Welcome to Lorry Reservation System. <br> Here you can make a lorry reservation for moving house, deliveries and others.</p>
        </div>
        <div class="p-5 col-md-5" style="">
          <h3 class="mb-3">Login Here</h3>
          <form style="">
            <div class="form-group"> <label>Email</label> <input class="form-control" type="text" name="cusEmail" placeholder="Type here"> </div>
            <div class="form-group"><label>Password</label><input class="form-control" type="password" name="cusPassword" placeholder="Type here"></div>
            <button type="submit" class="btn mt-4 btn-block btn-outline-dark p-2"><b>Login</b></button>
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
