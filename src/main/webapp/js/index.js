$(function () {
    toastr.options = {
        "closeButton": false,
        "debug": false,
        "newestOnTop": false,
        "progressBar": false,
        "positionClass": "toast-top-center",
        "preventDuplicates": false,
        "onclick": null,
        "showDuration": "300",
        "hideDuration": "1000",
        "timeOut": "2000",
        "extendedTimeOut": "1000",
        "showEasing": "swing",
        "hideEasing": "linear",
        "showMethod": "fadeIn",
        "hideMethod": "fadeOut"
    }
})

function _status(value) {
    if (value == 1) {
        return "是";
    } else {
        return "否";
    }
}

function _imgs(value) {
    return '<img style="height: 80px;" src="' + value + '"/>';
}

function _status_2(value) {
    if (value == 1) {
        return "有效";
    } else {
        return "无效";
    }
}

function _logo(value) {
    if ("" != value && null != value) {
        return '<img style="height: 40px;" src=' + value + '>';
    }
}


var ftxmsg = {
    tip: function (title) {
        swal({
            title: "",
            text: title,
            type: "warning",
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "确定",
        });
    },
    ok: function (title) {
        swal({
            title: "",
            text: title == null ? '操作成功' : title,
            type: "success",
            confirmButtonText: "确定",
        });
    },
    del: function (callback) {
        swal({
            title: "",
            text: "确定要删除这条信息吗，删除后将无法恢复，请谨慎操作",
            type: "warning",
            showCancelButton: true,
            cancelButtonText: "取消",
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "删除",
            closeOnConfirm: false
        }, function () {
            callback();
            //swal("", "您已经永久删除了这条信息。", "success");
        });
    },
    t_success: function (title) {
        toastr.success(title == null ? "操作成功" : title, "提示");
    },
    t_info: function (title) {
        toastr.info(title, "提示");
    },
    t_warning: function (title) {
        toastr.warning(title, "提示");
    },
    t_error: function (title) {
        toastr.error(title, "提示");
    }

}

function _uploader(buttonId, imgId, save_id) {
    var uploader = WebUploader.create({
        // 选完文件后，是否自动上传。
        auto: true,
        // swf文件路径
        swf: '/js/plugins/webuploader/Uploader.swf',
        // 文件接收服务端。
        server: '/ftx_upload/upload',
        // 内部根据当前运行是创建，可能是input元素，也可能是flash.
        pick: '#' + buttonId,
        // 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
        resize: false,
        // 文件上传参数表，用来标记文件的所有者（如果是一篇文章的附件，就是文章的ID）
        formData: {},
        //fileVal: 'uploadFile',
        // 单个文件大小限制（单位：byte），这里限制为 5M
        fileSingleSizeLimit: 5 * 1024 * 1024,
        // 只允许选择图片文件。
        accept: {
            title: 'Images',
            extensions: 'gif,jpg,jpeg,bmp,png',
            mimeTypes: 'image/*'
        }
    });
    uploader.on('uploadSuccess', function (oldFile, response) {
        var datas = response.data;
        if (datas) {
            $("#" + save_id).val(datas.imgId);
            $("#" + imgId).html("<div class=\"swiper-slide\">" +
                "<img  data-type='ckImg' data='" + datas.imgId + "' src='" + datas.imgUrl + "' att_no='" + datas.imgId + "' style='width: 100%;'/>");
        }
    });
}