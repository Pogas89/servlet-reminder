
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Names</title>
</head>
<br>
<table>
    <tr>
        <th>Names:</th>
    </tr>
    <%--@elvariable id="names" type="java.util.List"--%>
    <c:forEach var="name" items="${names}">
        <tr>
            <td>${name}</td>
        </tr>
    </c:forEach>

</table>
<br/>
<br/>
<br/>

<form action="/names" method="post">
    <label>Add name</label>
    <input type="text" name="newName" id="${newName}" required><br>
    <button>save</button>
</form>
</body>
</html>
