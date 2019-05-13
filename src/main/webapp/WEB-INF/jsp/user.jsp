<%--
  Created by IntelliJ IDEA.
  User: holystarpc-11
  Date: 2019/5/13
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>這是user.jsp頁面</h1>
<h1>我是${user}</h1>
<h1>我是${user1.name},我今年${user1.age}歲，我住在${user1.add},我的密碼是${user1.password}</h1>

<ul>
    <%--<c:forEach var="i" begin="1" end="5">--%>
    <%--<li> </li>--%>
    <%--</c:forEach>--%>
        <c:forEach var="user" items="${userList}">
            <li>編號：${user.id},姓名：${user.name},年齡：${user.age},住址：${user.add},密碼：${user.password}</li>
        </c:forEach>
</ul>
</body>
</html>
