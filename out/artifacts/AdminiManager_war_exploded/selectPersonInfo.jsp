<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: paiopiao
  Date: 2015/7/3
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div>
    <h1>处罚信息</h1>
    <hr>
    <table>
        <tr>
            <td>事项编号</td>
            <td>事项名称</td>
            <td>处理部门</td>
            <td>处罚类型</td>
            <td>处罚标准</td>
        </tr>
        <c:forEach items="${selectedpublish}" var="selectedpublish">
            <tr bgcolor="#F0FFF0">
                <td>${selectedpublish.item_Solvedepart}</td>
                <td>${selectedpublish.item_Punishcategory }</td>
                <td>${selectedpublish.item_Punishstandard }</td>
                <td>${selectedpublish.teaname }</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
