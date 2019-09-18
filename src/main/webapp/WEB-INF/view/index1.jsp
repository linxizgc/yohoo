<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="_head.jsp"/>
    <title>登录</title>
    <style>
        body {
            background: #fff url('${pageContext.request.contextPath}/img/bj.png') no-repeat left top;
            background-size: 100%;
        }
    </style>
</head>
<body>
<div style="margin-top: 15%; margin-left: 37%; background-color: #fff; width:26%; padding: 2rem; border-radius: .8rem;box-shadow: 4px 5px 20px #005ba6;">
    <form method="POST" action="/upload/singleUpload" enctype="multipart/form-data">
        <div class="container-fluid">
            <div class="row">
                <label class="col-sm-12 control-label">用户名</label>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <input type="text" class="form-control" id="loginName" name="loginName" placeholder="用户名">
                </div>
            </div>
            <br/>
            <div class="row">
                <label class="col-sm-12 control-label">密&nbsp;&nbsp;&nbsp;码</label>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <input type="password" class="form-control" id="loginPwd" name="loginPwd" placeholder="密&nbsp;&nbsp;&nbsp;&nbsp;码">
                </div>
            </div>
            <br/>
            <br/>
            <div class="row">
                <div class="col-sm-12">
                    <button type="button" class="btn btn-large btn-primary btn-block">登录</button>
                </div>
            </div>
        </div>
</div>
</form>
</div>
</body>
</html>
