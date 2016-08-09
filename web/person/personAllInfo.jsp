<%--
  Created by IntelliJ IDEA.
  User: paiopiao
  Date: 2015/7/3
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
<div>
    <h1>案件信息</h1>
    <hr>
    <table>
        <tr>
            <td>名字</td>
            <td>性别</td>
            <td>学分</td>
            <td>授课老师</td>
        </tr>
        <c:forEach items="${selectpersoninf}" var="selectpersoninf">
            <tr bgcolor="#F0FFF0">
                <td>${selectpersoninf.pname }</td>
                <td>${selectpersoninf.sex }</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
