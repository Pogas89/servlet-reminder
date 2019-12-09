<%@ page isErrorPage="true" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ups! Error!</title>
</head>
<body>
Name of Servlet: ${pageContext.errorData.servletName}
<br/>
Code: ${pageContext.errorData.statusCode}
<br/>
Exception: ${pageContext.exception}
<br/>
Message: ${pageContext.exception.message}
<br/>
</body>
</html>
