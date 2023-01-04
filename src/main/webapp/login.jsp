<%--
  Created by IntelliJ IDEA.
  User: hectorperez
  Date: 1/4/23
  Time: 7:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>

<form action="/login" method="POST">
    <label for="username">Username</label>
    <input id="username" name="username">
    <label for="password">Password</label>
    <input id="password" name="password">
    <button type="submit">Login</button>
</form>

<%@ include file="partials/footer.jsp" %>
</body>
</html>
