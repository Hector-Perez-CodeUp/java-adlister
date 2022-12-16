<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: hectorperez
  Date: 12/15/22
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login.jsp" method="post">
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input id="uname" type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input id="psw" type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit">Login</button>
  </div>
</form>


<%
if(request.getMethod().equalsIgnoreCase("POST")) {
  String uname = request.getParameter("uname");
  String psw = request.getParameter("psw");

  if(uname.equalsIgnoreCase("admin") && psw.equalsIgnoreCase("password")) {
    response.sendRedirect("/profile.jsp");
  } else {
    PrintWriter outWriter = response.getWriter();
    outWriter.println("<h3>Didnt work</h3>");
  }
}
%>
</body>
</html>
