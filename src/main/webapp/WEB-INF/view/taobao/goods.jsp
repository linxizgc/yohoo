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
<!-- 上传提示窗 -->
<div class="modal fade" tabindex="-1" role="dialog" id="_uploda_jd_modal" style="overflow: auto;" data-backdrop="static"
     data-keyboard="false">
    <div class="modal-dialog" style="width: 80%;" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">上传进度</h4>
            </div>
            <div class="modal-body" style="text-align: center;" >
                <div style="margin: 20px 25%;">
                    <div class="sk-spinner sk-spinner-wave" id="_loader">
                        <div class="sk-rect1"></div>
                        <div class="sk-rect2"></div>
                        <div class="sk-rect3"></div>
                        <div class="sk-rect4"></div>
                        <div class="sk-rect5"></div>
                    </div>
                </div>
                <div style="margin: 20px 25%;font-size: 60px; color: #1ab394; display: none;" id="_success">
                    <i class="fa fa-check"></i>
                </div>
                <div style="margin: 20px 25%;" id="_file_name">
                    20190427-女装数据.xls
                </div>
                <div style="margin: 20px 25%;" id="_is_success">
                    导入中，请稍等......
                </div>
            </div>
        </div>
    </div>
</div>

<div class="wrapper wrapper-content animated fadeInRight">
    <ol class="breadcrumb" style="background-color: #f3f3f4; ">
        <li><a href="#"><i class="${icon}"></i> ${f}</a></li>
        <li class="active">${z}</li>
    </ol>
    <div class="ibox-content">

        <div id="filePicker5" name="filePicker" style="float: right; margin-left: 3px;"><i class="fa fa-file-excel-o"></i>&nbsp;导入其它</div>
        <div id="filePicker4" name="filePicker" style="float: right; margin-left: 3px;"><i class="fa fa-file-excel-o"></i>&nbsp;导入配饰</div>
        <div id="filePicker3" name="filePicker" style="float: right; margin-left: 3px;"><i class="fa fa-file-excel-o"></i>&nbsp;导入包包</div>
        <div id="filePicker2" name="filePicker" style="float: right; margin-left: 3px;"><i class="fa fa-file-excel-o"></i>&nbsp;导入鞋子</div>
        <div id="filePicker1" name="filePicker" style="float: right; margin-left: 3px;"><i class="fa fa-file-excel-o"></i>&nbsp;导入女装</div>

        <div class="row" style="float: right;">
            <div class="col-sm-12">
                <div id="tools" class="form-inline">
                    <div class="input-group">
                        <input type="text" class="form-control btn-sm" id="key_word"
                               style="width: 250px;height: 2.5rem;font-size: 12px;" placeholder="请输入商品名称">
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
                <table id="_tbgoods_table"  class="table table-striped table-condensed">
                    <thead>
                    <tr>
                        <th data-field="shopName" data-align="center">店铺名称</th>
                        <th data-field="gooName" data-align="center">商品名称</th>
                        <th data-field="gooImg" data-align="center" data-formatter="_imgs">商品图片</th>
                        <%--<th data-field="gooPrice" data-align="center">商品价格</th>--%>
                        <%--<th data-field="commission" data-align="center">佣金</th>--%>
                        <%--<th data-field="incomeRatio" data-align="center">收入比例</th>--%>
                        <%--<th data-field="monthSale" data-align="center">月销量</th>--%>
                        <%--<th data-field="tkUrl" data-align="center">淘客链接</th>--%>
                        <%--<th data-field="tkPassword" data-align="center">淘客口令</th>--%>
                        <%--<th data-field="couponTotal" data-align="center">优惠券总量</th>--%>
                        <%--<th data-field="couponSurp" data-align="center">优惠券剩余</th>--%>
                        <th data-field="couponVal" data-align="center">优惠券面额</th>
                        <%--<th data-field="couponUrl" data-align="center">优惠券链接</th>--%>
                        <th data-field="couponPassword" data-align="center">优惠券口令</th>
                        <%--<th data-field="couponBegin" data-align="center">开始时间</th>--%>
                        <th data-field="couponEnd" data-align="center">结束时间</th>
                        <th data-field="sorts" data-align="center">排序</th>
                        <th data-field="status" data-align="center" data-formatter="_status_2">状态</th>
                        <th data-align="commission" data-formatter="_operation">操作</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>

    </div>
</div>

<%--<div class="modal fade" tabindex="-1" role="dialog" id="_tbgoods_modal" style="overflow: auto" data-backdrop="static"--%>
     <%--data-keyboard="false">--%>
    <%--<form class="form-horizontal" id="_tbgoods_from" action="/tb_banner/save" method="post" enctype="multipart/form-data">--%>
        <%--<div class="modal-dialog" style="width: 80%;" role="document">--%>
            <%--<div class="modal-content">--%>
                <%--<div class="modal-header">--%>
                    <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
                        <%--<span aria-hidden="true">&times;</span>--%>
                    <%--</button>--%>
                    <%--<h4 class="modal-title">类型详情</h4>--%>
                <%--</div>--%>
                <%--<input type="hidden" id="typeId" name="typeId">--%>
                <%--<div class="modal-body">--%>
                    <%--<div class="form-group">--%>
                        <%--<label for="typeName" class="col-sm-2 control-label">名称</label>--%>
                        <%--<div class="col-sm-8">--%>
                            <%--<input type="text" class="form-control" id="typeName" name="typeName" placeholder="名称">--%>
                        <%--</div>--%>
                    <%--</div>--%>
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
                        <%--<label for="sorts" class="col-sm-2 control-label">排序</label>--%>
                        <%--<div class="col-sm-8">--%>
                            <%--<input type="text" class="form-control" id="sorts" name="sorts" placeholder="排序">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label for="title" class="col-sm-2 control-label">标题</label>--%>
                        <%--<div class="col-sm-8">--%>
                            <%--<input type="text" class="form-control" id="title" name="title" placeholder="标题">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label for="content" class="col-sm-2 control-label">内容</label>--%>
                        <%--<div class="col-sm-8">--%>
                            <%--<textarea type="text" rows="3" class="form-control" id="content" name="content" placeholder="内容"></textarea>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<input type="hidden" id="logo" name="logo">--%>
                        <%--<label for="typeName" class="col-sm-2 control-label">图片</label>--%>
                        <%--<div class="col-sm-8">--%>
                            <%--<div id="filePicker" name="filePicker" style="margin-bottom: 10px;"><span class='glyphicon glyphicon-picture'></span>&nbsp;点击上传</div>--%>
                            <%--<div id="fileList" name="fileList" class="uploader-list" style="width: 126px;height: 126px"></div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="modal-footer">--%>
                    <%--<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>--%>
                    <%--<button type="submit" class="btn btn-primary" id="_tbgoods_saves">保存</button>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</form>--%>
<%--</div>--%>
</body>
<style type="text/css">
    #filePicker div:nth-child(2) {
        width: 100% !important;
        height: 100% !important;
    }
</style>
<script src="${pageContext.request.contextPath}/custom/js/taobao/goods.js"></script>
</html>
