<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>HelloWorld</title>
</head>
<body>
<h1>Hello World Servlet</h1>
<h2>Scriplets added</h2>
<%!
    String name = "addedName";
%>
<%
    out.println("SessionId=" + pageContext.getSession().getId());
%>
<br/>
<%
    out.println("Name=");
%>
<%=name
%>

<br/>
<h3>Session creation time ${sessionCreationTime}</h3>
<br/>
<br/>
<form action="/error.jsp" method="get">
    <input type="submit" value="GenerateError"/>
</form>
</body>
</html>