<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>数据展示</h1>
<c:forEach items="${users}" var="user" varStatus="">
    <li>${user.id}</li>
    <li>${user.name}</li>
    <li>${user.money}</li>
</c:forEach>
</body>
</html>
