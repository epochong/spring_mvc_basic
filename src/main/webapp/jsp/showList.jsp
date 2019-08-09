<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html>
<head>
    <title>spring_mvc_basic</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <td>userID</td>
        <td>userName</td>
    </tr>
    <c:forEach items="${userInfos}" var="tem">
        <tr>
            <td>${tem.userId}</td>
            <td>${tem.userName}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>