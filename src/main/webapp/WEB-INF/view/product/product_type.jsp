<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../_head.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>稀饭 - 产品列表</title>
    <meta name="keywords" content="响应式后台">
    <meta name="description" content="使用了Html5+CSS3等现代技术">
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <ol class="breadcrumb" style="background-color: #f3f3f4; ">
        <li><a href="#"><i class="${icon}"></i> ${f}</a></li>
        <li class="active">${z}</li>
    </ol>
    <div class="ibox-content">
        <div class="row">
            <div class="col-sm-12">
                <div id="tools" class="form-inline" style="display: flex;">
                    <div class="input-group">
                        <div>
                            <input type="text" class="form-control my-search" id="key_word" style="width:300px;"
                                   placeholder="请输入类型名称">
                        </div>
                        <span class="input-group-btn">
                            <button type="button" id="_serch" class="btn btn-primary btn-sm"><i
                                    class="fa fa-search"></i>&nbsp;搜索</button>
                            <button class="btn btn-success btn-sm" data-toggle="modal" data-target="#_type_modal"
                                    id="_add_btn"><i class="fa fa-plus"></i>&nbsp;新增</button>
                            <%--<button type="button" class="btn btn-primary"><i--%>
                                    <%--class="fa fa-reorder"></i>&nbsp;绑定操作菜单</button>--%>
                        </span>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <table id="_type_table" class="table table-striped table-condensed">
                    <thead>
                    <tr>
                        <th data-field="sorts" data-align="center">排序</th>
                        <th data-field="typeName" data-align="center">名称</th>
                        <%--<th data-field="typeName" data-align="center">名称</th>--%>
                        <%--<th data-field="typeName" data-align="center">名称</th>--%>
                        <%--<th data-field="typeName" data-align="center">名称</th>--%>
                        <%--<th data-field="typeName" data-align="center">名称</th>--%>
                        <%--<th data-field="typeName" data-align="center">名称</th>--%>
                        <%--<th data-field="title" data-align="center">标题</th>--%>
                        <th data-field="content" data-align="center">内容</th>
                        <%--<th data-field="onTop" data-align="center" data-formatter="_status">置顶</th>--%>
                        <%--<th data-field="fullPath" data-align="center" data-formatter="_logo">logo</th>--%>
                        <th data-align="center" data-formatter="_operation">操作</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" tabindex="-1" role="dialog" id="_type_modal" style="overflow: auto" data-backdrop="static"
     data-keyboard="false">
    <form class="form-horizontal" id="_type_from" action="/ftx_type/save" method="post" enctype="multipart/form-data">
        <div class="modal-dialog" style="width: 80%;" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title">类型详情</h4>
                </div>
                <input type="hidden" id="typeId" name="typeId">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="sorts" class="col-sm-2 control-label">排序</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="sorts" name="sorts" placeholder="排序">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="typeName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="typeName" name="typeName" placeholder="名称">
                        </div>
                    </div>
                    <%--<div class="form-group">--%>
                        <%--<label for="onTop" class="col-sm-2 control-label">置顶</label>--%>
                        <%--<div class="col-sm-8">--%>
                            <%--<select id="onTop" name="onTop" class="form-control">--%>
                                <%--<option value="0">否</option>--%>
                                <%--<option value="1">是</option>--%>
                            <%--</select>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label for="title" class="col-sm-2 control-label">标题</label>--%>
                        <%--<div class="col-sm-8">--%>
                            <%--<input type="text" class="form-control" id="title" name="title" placeholder="标题">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <div class="form-group">
                        <label for="content" class="col-sm-2 control-label">内容</label>
                        <div class="col-sm-8">
                            <textarea type="text" rows="3" class="form-control" id="content" name="content"
                                      placeholder="内容"></textarea>
                        </div>
                    </div>
                    <%--<div class="form-group">--%>
                        <%--<input type="hidden" id="logo" name="logo">--%>
                        <%--<label for="typeName" class="col-sm-2 control-label">图片</label>--%>
                        <%--<div class="col-sm-8">--%>
                            <%--<div id="filePicker" name="filePicker" style="margin-bottom: 10px;"><span--%>
                                    <%--class='glyphicon glyphicon-picture'></span>&nbsp;点击上传--%>
                            <%--</div>--%>
                            <%--<div id="fileList" name="fileList" class="uploader-list"--%>
                                 <%--style="width: 126px;height: 126px"></div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><i class="fa fa-reply"></i> 取消</button>
                    <button type="submit" class="btn btn-primary btn-sm" id="_type_saves"><i class="fa fa-save"></i> 保存</button>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
<style type="text/css">
    #filePicker div:nth-child(2) {
        width: 100% !important;
        height: 100% !important;
    }

    #property_filePicker div:nth-child(2) {
        width: 100% !important;
        height: 100% !important;
    }
</style>
<script src="${pageContext.request.contextPath}/custom/js/product/product_type.js"></script>
</html>
