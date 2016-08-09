<%--
  Created by IntelliJ IDEA.
  User: paiopiao
  Date: 2015/7/2
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>行政处罚管理</title>
    <link href="css/layout.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<header>
    <h2 align="center">行政处罚</h2>

    <div class="header_user" style="position:absolute; width:150px; height:100px;top:50px;right:0;">
        您好
        <c:choose>
            <c:when test="${empty sessionScope.person}">
                个人，${sessionScope.Pname }
            </c:when>
            <c:when test="${empty sessionScope.manager}">
                管理员，${sessionScope.Mname }
            </c:when>
            <c:otherwise>
                企业，${sessionScope.Cname }
            </c:otherwise>
        </c:choose>
        <a href="logout" style="color: #FFF;">注销</a>

    </div>
    <!--<a href="#" class="stuts">注销
        <span>Script Tutorials</span></a>-->
    <!--<a href="#" style="text-align: right;">注销</a>-->
</header>

<ul id="nav">
    <li><a href="/index.jsp">Home</a></li>
    <li><a class="hsubs" href="#">业务管理</a>
        <ul class="subs">
            <li><a href="/PersonInf">查询案件信息</a></li>
            <li><a href="/insertPerson.jsp">添加个人</a></li>
            <li><a href="/insertCompany.jsp">增加企业信息</a></li>
            <li><a href="/selectPersonInputInfo.jsp">查询个人处罚信息</a></li>
            <li><a href="#">查询企业处罚信息</a></li>
        </ul>
    </li>
    <li><a class="hsubs" href="#">行政处罚管理</a>
        <ul class="subs">
            <li><a href="#">查询处罚库</a></li>
        </ul>
    </li>
    <li><a class="hsubs" href="#">立案信息管理</a>
        <ul class="subs">
            <li><a href="personCaseRegister.jsp">个人立案</a></li>
            <li><a href="#">企业立案</a></li>
            <li><a href="updatePersonInfo.jsp">个人立案修改</a></li>
            <li><a href="#">企业立案修改</a></li>
        </ul>
    </li>
    <li><a href="#">Menu 4</a></li>
    <li><a href="#">Menu 5</a></li>
    <li><a href="#">Menu 6</a></li>
    <li><a href="#">Back</a></li>
</ul>
<div align="center">
    <iframe src="/picture.jsp" width="75%" height="90%" frameborder=0></iframe>
</div>
</body>
</html>