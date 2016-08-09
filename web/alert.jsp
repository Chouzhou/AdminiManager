<%--
  Created by IntelliJ IDEA.
  User: paiopiao
  Date: 2015/7/2
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <meta charset="utf-8">
    <script type="text/javascript">
        alert("${sessionScope.msg}");
        location.href = "${sessionScope.dir}";
    </script>
</head>
