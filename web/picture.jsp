<%--
  Created by IntelliJ IDEA.
  User: paiopiao
  Date: 2015/7/2
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <style type="text/css">

        body, div, ul, li, a, img, h1 {
            margin: 0;
            padding: 0
        }

        img {
            border: none
        }

        ul, li {
            list-style-type: none
        }

        body {
            margin: 20px auto;
            font: 12px/1.5 tahoma, arial, \5b8b\4f53;
            color: #373737;
            background: #fff;
        }

        .boxx {
            width: 698px;
            height: 338px;
            margin: 0 auto;
            position: relative;
            border: 1px #ccc solid;
        }

        .boxx_con {
            width: 200%;
           /* position: absolute;*/
            z-index: 10;
        }

        .boxx_title {
            width: 250px;
            height: 90px;
            position: absolute;
            top: 313px;
            left: 545px;
            z-index: 100;
        }

        .boxx_title li {
            width: 15px;
            height: 15px;
            float: left;
            margin-left: 10px;
            display: inline;
            cursor: pointer;
            line-height: 15px;
            text-align: center;
            background: #f7f6f2;
            color: #373737;
        }

        li.bks {
            color: #fff;
            background: #ce2329;
        }

        <!--
        css优先级, 慎用直接.bks-- >

    </style>

</head>


<body>

<div class="boxx">

    <ul class="boxx_con" id="boxx_con">

        <li><a href="#"><img src="imgs/1.jpg"/></a></li>

        <li style="display:none"><a href="#"><img src="images/2.jpg"/></a></li>

        <li style="display:none"><a href="#"><img src="images/3.jpg"/></a></li>

        <li style="display:none"><a href="#"><img src="images/4.jpg"/></a></li>

        <li style="display:none"><a href="#"><img src="images/5.jpg"/></a></li>

    </ul>

    <ul class="boxx_title" id="boxx_title">

        <li class="bks">1</li>

        <li>2</li>

        <li>3</li>

        <li>4</li>

        <li>5</li>

    </ul>

</div>

<script type="text/javascript">

    $(document).ready(function () {

        var p = 0;

        var timeInterval = 3000;

        var $bli = $("#boxx_con li");

        var $pli = $("#boxx_title li");


        $bli.hide();

        $($bli[0]).show();

        function play() {

            p < $bli.length - 1 ? p++ : p = 0;

            $bli.eq(p).show().siblings().hide();

            $pli.eq(p).addClass("bks").siblings().removeClass("bks");

        }

        set = window.setInterval(play, timeInterval);

        $pli.mouseover(function () {

            window.clearInterval(set);

            p = $(this).index();

            $bli.eq(p).show().siblings().hide();

            $pli.eq(p).addClass("bks").siblings().removeClass("bks");

            set = window.setInterval(play, timeInterval);

        });

    })

</script>

</body>
