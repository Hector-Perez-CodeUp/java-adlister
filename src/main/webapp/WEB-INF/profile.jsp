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
<%@ include file="/partials/navbar.jsp" %>

<form action="/logout" method="post">
    <button type="submit">Logout</button>
</form>

<%@ include file="/partials/footer.jsp" %>
</body>
</html>
