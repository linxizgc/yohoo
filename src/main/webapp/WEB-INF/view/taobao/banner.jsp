<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../_head.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>稀饭 - TBBanner</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <ol class="breadcrumb" style="background-color: #f3f3f4; ">
        <li><a href="#"><i class="${icon}"></i> ${f}</a></li>
        <li class="active">${z}</li>
    </ol>
    <div class="ibox-content">
        <div class="row" style="float: right;">
            <div class="col-sm-12">
                <div id="tools" class="form-inline">
                    <div class="input-group">
                        <input type="text" class="form-control btn-sm" id="key_word"
                               style="width: 250px;height: 2.5rem;font-size: 12px;" placeholder="请输入Banner名称">
                        <span class="input-group-btn">
                            <button type="button" id="_serch" class="btn btn-primary btn-sm">搜索</button></span>
                    </div>
                    <button class="btn btn-success btn-sm" data-toggle="modal" data-target="#_tbbanner_modal"
                            id="_add_btn">新增
                    </button>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <table id="_tbbanner_table"  class="table table-striped table-condensed">
                    <thead>
                    <tr>
                        <th data-field="banTitle" data-align="center">标题</th>
                        <th data-field="linkUrl" data-align="center">跳转路径</th>
                        <th data-field="linkImg" data-align="center">图片</th>
                        <th data-field="sorts" data-align="center">排序</th>
                        <th data-align="center" data-formatter="_operation">操作</th>
                        <th data-field="status" data-formatter="_status_css3" data-widt="10px">状态</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>

    </div>
</div>

<div class="modal fade" tabindex="-1" role="dialog" id="_tbbanner_modal" style="overflow: auto" data-backdrop="static"
     data-keyboard="false">
    <form class="form-horizontal" id="_tbbanner_from" action="/tb_banner/save" method="post" enctype="multipart/form-data">
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
                        <label for="typeName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="typeName" name="typeName" placeholder="名称">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="onTop" class="col-sm-2 control-label">置顶</label>
                        <div class="col-sm-8">
                            <select id="onTop" name="onTop" class="form-control">
                                <option value="0">否</option>
                                <option value="1">是</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="sorts" class="col-sm-2 control-label">排序</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="sorts" name="sorts" placeholder="排序">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="title" class="col-sm-2 control-label">标题</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="title" name="title" placeholder="标题">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="content" class="col-sm-2 control-label">内容</label>
                        <div class="col-sm-8">
                            <textarea type="text" rows="3" class="form-control" id="content" name="content" placeholder="内容"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="hidden" id="logo" name="logo">
                        <label for="typeName" class="col-sm-2 control-label">图片</label>
                        <div class="col-sm-8">
                            <div id="filePicker" name="filePicker" style="margin-bottom: 10px;"><span class='glyphicon glyphicon-picture'></span>&nbsp;点击上传</div>
                            <div id="fileList" name="fileList" class="uploader-list" style="width: 126px;height: 126px"></div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="submit" class="btn btn-primary" id="_tbbanner_saves">保存</button>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
<script src="${pageContext.request.contextPath}/custom/js/taobao/banner.js"></script>
</html>
