<%--
  Created by IntelliJ IDEA.
  User: Артур
  Date: 19.09.2020
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<%
    String user = null;
    String sessionUser = (String) session.getAttribute("username");
    if (sessionUser == null){
        response.sendRedirect("login.html");
    } else {
        user = sessionUser;
    }

    String userName = null;
    String sessionId = null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c: cookies) {
            if (c.getName().equals("username")) userName = c.getValue();
            if (c.getName().equals("JSESSIONID")) sessionId = c.getValue();
        }
    } else {
        sessionId = session.getId();
    }
%>
<h3>Hello, <%=userName%>! Login Succesful
Session ID=<%= sessionId%>></h3>
<form action="/logout" method="post">
    <input type="submit" value="logout">
</form>
</body>
</html>
