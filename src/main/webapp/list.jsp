<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<body>

<h2>list page</h2>
<%--
    shiro标签使用方法:
        https://blog.csdn.net/yaodieteng1510/article/details/79992247
--%>
Welcome:<shiro:principal></shiro:principal>
<br><br>

<shiro:hasAnyRoles name="admin,user">
    <label>这是拥有admin或者是user角色的用户</label>
    <br><br>
</shiro:hasAnyRoles>

<shiro:hasRole name="admin">
<a href="admin.jsp">Admin Page</a>
<br><br>
</shiro:hasRole>
<shiro:hasRole name="roleTest1">
    <a href="roleTest1.jsp">RoleTest1 Page</a>
    <br><br>
</shiro:hasRole>
<shiro:hasRole name="user">
<a href="user.jsp">User Page</a>
<br><br>
</shiro:hasRole>
<shiro:hasPermission name="user:create">
    <a href="userCreate.jsp">UserCreate Page</a>
    <br><br>
</shiro:hasPermission>
<shiro:hasPermission name="student:create">
    <a href="studentCreate.jsp">StudentCreate Page</a>
    <br><br>
</shiro:hasPermission>
<shiro:hasPermission name="exam:delete">
    <a href="examDelete.jsp">ExamDelete Page</a>
    <br><br>
</shiro:hasPermission>
<a href="/shiro/testShiroAnnotation">Test ShiroAnnotation</a>
<br><br>

<a href="shiro/logout">Logout</a>
</body>
</html>
