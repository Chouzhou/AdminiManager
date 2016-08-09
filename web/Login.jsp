<%--
  Created by IntelliJ IDEA.
  User: paiopiao
  Date: 2015/6/30
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <title>行政管理</title>
    <!-- <link rel="stylesheet" type="text/css">-->
    <style type="text/css">
        html {
            background-color: #E9EEF0
        }

        .wrapper {
            margin: 140px auto;
            width: 884px;
        }

        .loginBox {
            background-color: #FEFEFE;
            border: 1px solid #BfD6E1;
            border-radius: 5px;
            color: #444;
            font: 14px 'Microsoft YaHei', '微软雅黑';
            margin: 0 auto;
            width: 388px
        }

        .loginBox .loginBoxCenter {
            border-bottom: 1px solid #DDE0E8;
            padding: 24px;
        }

        .loginBox .loginBoxCenter p {
            margin-bottom: 10px
        }

        .loginBox .loginBoxButtons {
            background-color: #F0F4F6;
            border-top: 1px solid #FFF;
            border-bottom-left-radius: 5px;
            border-bottom-right-radius: 5px;
            line-height: 28px;
            overflow: hidden;
            padding: 20px 24px;
            vertical-align: center;
        }

        .loginBox .loginInput {
            border: 1px solid #D2D9dC;
            border-radius: 2px;
            color: #444;
            font: 12px 'Microsoft YaHei', '微软雅黑';
            padding: 8px 14px;
            margin-bottom: 8px;
            width: 310px;
        }

        .loginBox .loginInput:FOCUS {
            border: 1px solid #B7D4EA;
            box-shadow: 0 0 8px #B7D4EA;
        }

        .loginBox .loginBtn {
            background-image: -moz-linear-gradient(to bottom, #B5DEF2, #85CFEE);
            border: 1px solid #98CCE7;
            border-radius: 20px;
            box-shadow: inset rgba(255, 255, 255, 0.6) 0 1px 1px, rgba(0, 0, 0, 0.1) 0 1px 1px;
            color: #FFF;
            cursor: pointer;
            float: right;
            font: bold 13px Arial;
            padding: 5px 14px;
        }

        .loginBox .loginBtn:HOVER {
            background-image: -moz-linear-gradient(to top, #B5DEF2, #85CFEE);
        }

        .loginBox a.forgetLink {
            color: #ABABAB;
            cursor: pointer;
            float: right;
            font: 11px/20px Arial;
            text-decoration: none;
            vertical-align: middle;
        }

        .loginBox a.forgetLink:HOVER {
            text-decoration: underline;
        }

        .loginBox input#remember {
            vertical-align: middle;
        }

        .loginBox label[for="remember"] {
            font: 11px Arial;
        }
    </style>
</head>
<body>
<div class="wrapper">
    <form action="login" method="post">
        <div class="loginBox">
            <h1 align="center">行政管理系统登陆</h1>

            <div class="loginBoxCenter">
                <p><label for="username">用户名：</label></p>

                <p><input type="username" id="username" name="username" class="loginInput" autofocus="autofocus"
                          required="required" autocomplete="off" placeholder="请输入用户名" value=""/></p>

                <p><label for="password">密码：</label><a class="forgetLink" href="#">忘记密码?</a></p>

                <p><input type="password" id="password" name="password" class="loginInput" required="required"
                          placeholder="请输入密码" value=""/></p>
            </div>
            <div class="loginBoxButtons">
                管理员<input type="radio" name="type" value="m" checked
                          style="">
                &nbsp;&nbsp;&nbsp;&nbsp;
                个人<input type="radio" name="type" value="p">
                &nbsp;&nbsp;&nbsp;&nbsp;
                企业<input type="radio" name="type" value="c"><br>
                <input id="remember" type="checkbox" name="remember"/>
                <label for="remember">记住登录状态</label>
                <button class="loginBtn" type="submit">登录</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
