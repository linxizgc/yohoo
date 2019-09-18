<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../_head.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>稀饭 - 大属性列表</title>
    <meta name="keywords" content="响应式后台">
    <meta name="description" content="使用了Html5+CSS3等现代技术">
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <ol class="breadcrumb" style="background-color: #f3f3f4; ">
        <li><a href="#"><i class="${icon}"></i> ${f}</a></li>
        <li class="active">${z}</li>
    </ol>
    <div class="row">
        <div class="row">
            <div class="col-sm-3">
                <div class="ibox float-e-margins">
                    <div class="ibox-content mailbox-content">
                        <div class="file-manager">
                            <div style="padding-right:1rem;margin-top: 2rem;border-bottom: 1px solid #e7eaec; display: flex; justify-content: space-between;">
                                <div style="padding-left:2rem;font-weight: bold;">商品属性</div>
                                <div><a href="javascript:;" title="新增" data-toggle="modal"
                                        data-target="#_big_modal"><span class="glyphicon glyphicon-plus"></span>&nbsp;
                                </a></div>
                            </div>
                            <input type="hidden" id="_click_bigAttrId" >
                            <ul class="folder-list m-b-md" style="padding: 0;" id="_big_menus">
                                <li style="padding-left:2rem;height: 4rem;line-height: 4rem;">
                                    <div style="display: flex;justify-content: space-between;">
                                        <a href="javascript:;" style="width: 60%;"><i class="fa fa-coffee"></i> 规格</a>
                                        <div>
                                            <a href="javascript:;" style="float: left;" title="修改"><span
                                                    class="glyphicon glyphicon-pencil"></span>&nbsp;</a>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <a href="javascript:;" style="float: left;" title="删除"><span
                                                    class="glyphicon glyphicon-remove"></span>&nbsp;</a>
                                        </div>
                                    </div>
                                </li>
                                <li style="padding-left:2rem;height: 4rem;line-height: 4rem;">
                                    <div style="display: flex;justify-content: space-between;">
                                        <a href="javascript:;"><i class="fa fa-coffee"></i> 温度</a>
                                        <div>
                                            <a href="javascript:;" style="float: left;"><span
                                                    class="glyphicon glyphicon-pencil"></span>&nbsp;</a>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <a href="javascript:;" style="float: left;"><span
                                                    class="glyphicon glyphicon-remove"></span>&nbsp;</a>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-9 animated fadeInRight">
                <div class="ibox-content">
                    <div class="row">
                        <div class="col-sm-12">
                            <div id="tools" class="form-inline" style="display: flex;">
                                <div class="input-group">
                                    <div>
                                        <input type="text" class="form-control my-search" id="key_word"
                                               style="width:300px;"
                                               placeholder="请输入类型名称">
                                    </div>
                                    <span class="input-group-btn">
                            <button type="button" id="_serch" class="btn btn-primary btn-sm"><i
                                    class="fa fa-search"></i>&nbsp;搜索</button>
                            <button class="btn btn-success btn-sm" data-toggle="modal" data-target="#_small_modal"
                                    id="_add_btn"><i class="fa fa-plus"></i>&nbsp;新增</button>
                        </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <table id="_small_table" class="table table-striped table-condensed">
                                <thead>
                                <tr>
                                    <th data-field="sorts" data-align="center">排序</th>
                                    <th data-field="smallAttrName" data-align="center">名称</th>
                                    <th data-field="addPrice" data-align="center">加价</th>
                                    <th data-align="center" data-formatter="_operation">操作</th>
                                </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" tabindex="-1" role="dialog" id="_big_modal" style="overflow: auto" data-backdrop="static"
     data-keyboard="false">
    <form class="form-horizontal" id="_big_from" action="/ftx_big_attr/save" method="post"
          enctype="multipart/form-data">
        <div class="modal-dialog" style="width: 50%;" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title">商品属性</h4>
                </div>
                <input type="hidden" id="bigAttrId" name="bigAttrId">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="sorts" class="col-sm-2 control-label">排序</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" name="sorts" placeholder="排序">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="bigAttrName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="bigAttrName" name="bigAttrName"
                                   placeholder="名称">
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><i
                            class="fa fa-reply"></i> 取消
                    </button>
                    <button type="submit" class="btn btn-primary btn-sm" id="_big_saves"><i class="fa fa-save"></i> 保存
                    </button>
                </div>
            </div>
        </div>
    </form>
</div>

<div class="modal fade" tabindex="-1" role="dialog" id="_small_modal" style="overflow: auto" data-backdrop="static"
     data-keyboard="false">
    <form class="form-horizontal" id="_small_from" action="/ftx_small_attr/save" method="post" enctype="multipart/form-data">
        <div class="modal-dialog" style="width: 60%;" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title">类型详情</h4>
                </div>
                <input type="hidden" id="smallAttrId" name="smallAttrId">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="sorts" class="col-sm-2 control-label">排序</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="sorts" name="sorts" placeholder="排序">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="parentAttrId" class="col-sm-2 control-label">父级</label>
                        <div class="col-sm-8">
                            <select class="form-control" id="parentAttrId" name="parentAttrId">
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="smallAttrName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="smallAttrName" name="smallAttrName" placeholder="名称">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="addPrice" class="col-sm-2 control-label">加价</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="addPrice" name="addPrice" placeholder="加价">
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><i
                            class="fa fa-reply"></i> 取消
                    </button>
                    <button type="submit" class="btn btn-primary btn-sm" id="_type_saves"><i class="fa fa-save"></i> 保存
                    </button>
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
    #_big_menus li:hover{
        background-color: #fff;
    }
</style>
<script src="${pageContext.request.contextPath}/custom/js/product/ftx_attr.js"></script>
</html>
