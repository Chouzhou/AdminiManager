<%--
  Created by IntelliJ IDEA.
  User: paiopiao
  Date: 2015/6/30
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>JS+CSS打造仿QQ面板的三级折叠下拉菜单丨芯晴网页特效丨CsrCode.Cn</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
            border: 0px;
        }

        body {
            font-size: 12px;
            color: #333;
            text-align: center;
        }

        .mbox {
            background: #73C2FF;
            width: 184px;
            height: auto;
        }

        .mbox .m1 {
            background: url(/images/20110420/m1.gif) no-repeat left;
            width: 182px;
            height: 25px;
            line-height: 25px;
            color: #4B6486;
            font-size: 14px;
            font-weight: 700;
            text-align: left;
            text-indent: 19px;
        }

        .mbox .m2 {
            background: url(/images/20110420/m2.gif) no-repeat left;
            width: 182px;
            height: 25px;
            line-height: 25px;
            color: #4B6486;
            font-size: 20px;
            font-weight: 700;
            text-align: left;
            text-indent: 19px;
        }

        .mbox .Test5study {
            background: #fff;
        }

        .mbox .Test5study {
            text-align: left;
            width: 182px;
            height: auto;
            overflow: hidden;
        }

        .mbox .Test5study h2 {
            font-size: 20px;
            height: 22px;
            line-height: 22px;
            background: #E5F5FF;
            text-indent: 10px;
            position: relative;
            border-top: 1px solid #fff;
            border-bottom: 1px solid #A9DAFF;
            font-weight: normal;
            cursor: pointer;
        }

        .mbox .Test5study h2 span {
            font-weight: normal;
            position: absolute;
            top: 0;
            right: 6px;
        }

        .mbox .Test5study li {
            border-bottom: dashed 1px #eee;
            line-height: 22px;
        }

        .mbox .Test5study {
            border-bottom: solid 1px #A9DAFF;
        }

        .mbox .TxtList {
            list-style: disc url();
            padding: 10px 0 10px 10px;
            height: 200px;
            overflow-y: scroll;
        }
    </style>
    <script language="javascript" id="clientEventHandlersJS">
        <!--
        var number = 2;
        function LMYC() {
            var lbmc;
            //var treePic;
            for (i = 1; i <= number; i++) {
                lbmc = eval('LM' + i);
                //treePic = eval('treePic'+i);
                //treePic.src = 'images/file.gif';
                lbmc.style.display = 'none';
            }
        }
        function ShowFLT(i) {
            lbmc = eval('LM' + i);
            //treePic = eval('treePic' + i)
            if (lbmc.style.display == 'none') {
                LMYC();
                //treePic.src = 'images/nofile.gif';
                lbmc.style.display = '';
            } else {
                //treePic.src = 'images/file.gif';
                lbmc.style.display = 'none';
            }
        }
        //-->
    </script>
</head>
<body>
<div class="mbox">
    <div class="m1">
        <a onClick="javascript:ShowFLT(1)" href="javascript:void(null)"
           style="text-decoration: none; color: #000">纱布</a>
    </div>
    <div id="LM1" style="display: none">
        <div id="Test5study" class="Test5study">
            <h2 id="t1" onClick="ShHi('t1','h1');">某某</h2>
            <ul class="TxtList" id="h1">
                <li><a href="#">某某</a></li>
                <li><a href="#">某某</a></li>
                <li><a href="#">某某</a></li>
                <li><a href="#">某某</a></li>
                <li><a href="#">某某</a></li>
                <li><a href="#">某某</a></li>
                <li><a href="#">某某</a></li>
            </ul>
            <h2 id="t2" onClick="ShHi('t2','h2');">某某</h2>
            <ul class="TxtList" id="h2" style="display: none;">
                <li><a href="#" title="">某某</a></li>
                <li><a href="#" title="">某某</a></li>
                <li><a href="#" title="">某某</a></li>
                <li><a href="#" title="">某某</a></li>
                <li><a href="#" title="">某某</a></li>
                <li><a href="#" title="">某某</a></li>
            </ul>
            <h2 id="t3" onClick="ShHi('t3','h3');">网页特效②</h2>
            <ul class="TxtList" id="h3" style="display: none;">
            </ul>
            <h2 id="t4" onClick="ShHi('t4','h4');">某某</h2>
            <ul class="TxtList" id="h4" style="display: none;">
            </ul>
        </div>
    </div>
</div>
<div class="mbox">
    <div class="m1">
        <a onClick="javascript:ShowFLT(2)" href="javascript:void(null)"
           style="text-decoration: none; color: #4B6486">标题2</a>
    </div>
    <div id="LM2" style="DISPLAY: none">
        <div id="Test5study" class="Test5study">
            <h2 id="t5" onClick="ShHi('t5','h5');">传说中的标题2</h2>
            <ul class="TxtList" id="h5">
            </ul>
            <h2 id="t6" onClick="ShHi('t6','h6');">传说中的标题2</h2>
            <ul class="TxtList" id="h6" style="display: none;">
            </ul>
            <h2 id="t7" onClick="ShHi('t7','h7');">传说中的标题2</h2>
            <ul class="TxtList" id="h7" style="display: none;">
            </ul>
            <h2 id="t8" onClick="ShHi('t8','h8');">传说中的标题2</h2>
            <ul class="TxtList" id="h8" style="display: none;">
            </ul>
        </div>
    </div>
</div>
<script type="text/javascript">
    function $(d) {
        return document.getElementById(d);
    }
    function f(d) {
        var t = $(d);
        if (t) {
            return t.style;
        } else {
            return null;
        }
    }
    function Hi() {
        var items = document.getElementsByTagName("ul");
        for (var i = 0; i < items.length; i++) {
            items[i].style.display = 'none';
        }
    }
    function Hl() {
        var iteml = document.getElementsByTagName("h2");
        for (var j = 0; j < iteml.length; j++) {
            iteml[j].style.fontWeight = 'normal';
        }
    }
    function h(d) {
        var s = f(d);
        var b = s.display;
        if (b == 'none') {
            return true;
        } else {
            return false;
        }
    }
    function ShHi(ii, jj) {
        if (h(jj)) {
            Hl();
            Hi();
            f(jj).display = 'block';
            f(ii).fontWeight = 'bold';
        } else {
            Hl();
            Hi();
            f(jj).display = 'none';
            f(ii).fontWeight = 'normal';
        }
    }
</script>
</body>
</html>