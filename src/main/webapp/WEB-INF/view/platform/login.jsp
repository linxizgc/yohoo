<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../_head.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title>饭特稀 - 登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html"/>
    <![endif]-->
    <script>
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>
</head>
<body class="signin">
<div class="signinpanel">
    <div class="row">
        <div class="col-sm-7">
            <div class="signin-info">
                <div class="logopanel m-b">
                    <h1>[ 饭特稀 ]</h1>
                </div>
                <div class="m-b"></div>
                <h4>欢迎使用 <strong>饭特稀 后台管理系统</strong></h4>
                <ul class="m-b">
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 高效</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 稳定</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 安全</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 合作</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 共赢</li>
                </ul>
                <strong>还没有账号？ <a href="#">立即注册&raquo;</a></strong>
            </div>
        </div>
        <div class="col-sm-5">
            <form id="_loginForm" method="post" action="${pageContext.request.contextPath}/console/login">
                <h4 class="no-margins">登录：</h4>
                <p class="m-t-md">登录到饭特稀后台管理系统</p>
                <input type="text" class="form-control uname" id="loginName" name="loginName" placeholder="用户名"/>
                <input type="password" class="form-control pword m-b" id="password" name="password" placeholder="密码"/>
                <a href="">忘记密码了？</a>
                <button class="btn btn-success btn-block" id="btnSub">登录</button>
            </form>
        </div>
    </div>
    <div class="signup-footer">
        <div class="pull-left">
            &copy; 2019 All Rights Reserved. Fantexi
        </div>
    </div>
</div>
</body>
<script type="text/javascript">

    var contextPath = '${pageContext.request.contextPath}';

    $('input', $("#loginForm")).keydown(function (event) {
        if (event.keyCode == 13) {
            loginFormSubmit();
        }
    });

    $("#btnSub").click(function () {
        loginFormSubmit();
    });

    function loginFormSubmit() {
        $("#_loginForm").ajaxForm({
            beforeSubmit: function () {
                var loginName = $("#loginName").val();
                if (!loginName.match(/^[a-zA-Z0-9_]{4,16}$/)) {
                    xfmsg.tip('用戶名为4至16位的字母或数字或下划线');
                    return false;
                }
            },
            success: function (result) {
                if (result.success) {
                    window.location.href = contextPath + "/console/index";
                } else {
                    xfmsg.tip(result.message);
                }
            }
        });
    }
</script>
</html>
