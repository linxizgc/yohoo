<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/img/favicon.ico">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%-- jQuery 3 --%>
<script src="${pageContext.request.contextPath}/plugin/jquery3.1.1/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/plugin/jquery3.1.1/jquery.form.js"></script>
<script src="${pageContext.request.contextPath}/plugin/jquery3.1.1/jquery.loadJSON.min.js"></script>
<script src="${pageContext.request.contextPath}/plugin/jquery3.1.1/jquery.serializejson.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-ui-1.10.4.min.js"></script>


<!-- Sweet Alert -->
<script src="${pageContext.request.contextPath}/js/plugins/sweetalert/sweetalert.min.js"></script>
<link href="${pageContext.request.contextPath}/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">

<%-- Bootstrap 3.3.7 --%>
<link href="${pageContext.request.contextPath}/plugin/bootstrap/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/plugin/bootstrap/bootstrap.min.js"></script>

<!-- Bootstrap table -->
<link href="${pageContext.request.contextPath}/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>

<%-- common --%>
<link href="${pageContext.request.contextPath}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/animate.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/content.js?v=1.0.0"></script>

<!-- Webuploader -->
<script src="${pageContext.request.contextPath}/js/plugins/webuploader/webuploader.min.js"></script>
<link href="${pageContext.request.contextPath}/css/plugins/webuploader/webuploader.css" rel="stylesheet">

<!-- Toastr script -->
<script src="${pageContext.request.contextPath}/js/plugins/toastr/toastr.min.js"></script>
<link href="${pageContext.request.contextPath}/css/plugins/toastr/toastr.min.css" rel="stylesheet">




<script src="${pageContext.request.contextPath}/js/index.js"></script>