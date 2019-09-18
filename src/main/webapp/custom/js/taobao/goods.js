$(function () {
    _loadTable();

    _uploader_excel("filePicker1", "女装");
    _uploader_excel("filePicker2", "鞋子");
    _uploader_excel("filePicker3", "包包");
    _uploader_excel("filePicker4", "配饰");
    _uploader_excel("filePicker5", "其它");

    //保存
    $('#_tbgoods_from').ajaxForm({
        beforeSubmit: function () {
            var typeName = $('#typeName').val();
            if (typeName == "") {
                ftxmsg.t_warning("类型名称不能为空");
                return false;
            }
        },
        success: function (result) {
            if (result.success) {
                ftxmsg.t_success();
                $('#_tbgoods_modal').modal('hide');
                $('#_tbgoods_from').clearForm(true);
                $("#_tbgoods_table").bootstrapTable('refresh');
            } else {
                ftxmsg.t_error(result.message);
            }
        }
    });
    //详情
    $(document).on('click', '.btn-modify', function () {
        $.get('/tb_goods/findById', {
            typeId: $(this).attr("id")
        }, function (result) {
            $('#_tbgoods_modal').modal('show');
            $('#_tbgoods_from').loadJSON(result.record);
            $("#fileList").html("");
            if (result.record.fullPath) {
                $("#fileList").html("<div class=\"swiper-slide\">" +
                    "<img data-type='ckImg' src='" + result.record.fullPath + "' style='width: 100%;'/>");
            }
        });
    });
    //删除
    $(document).on('click', '.btn-remove', function () {
        var typeId = $(this).attr("id");
        ftxmsg.del(function () {
            $.get('/tb_goods/remove', {
                typeId: typeId
            }, function (result) {
                if (result.success) {
                    $("#_tbgoods_table").bootstrapTable('refresh');
                    swal("", "您已经永久删除了这条信息。", "success");
                } else {
                    ftxmsg.tip(result.message);
                }
            });
        })
    });
    //条件筛选
    $('#_serch').click(function () {
        _loadTable();
    });
    //新增
    $('#_add_btn').click(function () {
        $('#_tbgoods_from').clearForm(true);
    });
});

function _loadTable() {
    $("#_tbgoods_table").bootstrapTable('destroy');
    $("#_tbgoods_table").bootstrapTable({
        url: "/tb_goods/list",
        pagination: true,
        pageSize: 20,
        pageNumber: 1,
        pageList: [10, 20, 30],
        toolbar: "#tools",
        toolbarAlign: "right",
        queryParamsType: '', //queryParamsType的默认值为'limit',传给服务端的参数为：offset,limit,sort; 设置为''传给服务器的参数为：pageSize,pageNumber
        queryParams: queryParams,
        sidePagination: 'server'
    });
}

function queryParams(requestParams) {
    requestParams.gooName = $("#key_word").val();
    return requestParams;
}
function _status_css3(value) {
    if (value == 1) {
        return '<div class="switch">' +
            '    <div class="onoffswitch">' +
            '        <input type="checkbox" checked="" class="onoffswitch-checkbox" id="example1">' +
            '        <label class="onoffswitch-label" for="example1">' +
            '        <span class="onoffswitch-inner"></span>' +
            '        <span class="onoffswitch-switch"></span>' +
            '        </label>' +
            '    </div>' +
            '</div>';
    } else {
        return '<div class="switch">' +
            '    <div class="onoffswitch">' +
            '        <input type="checkbox" class="onoffswitch-checkbox" id="example2">' +
            '        <label class="onoffswitch-label" for="example2">' +
            '        <span class="onoffswitch-inner"></span>' +
            '        <span class="onoffswitch-switch"></span>' +
            '        </label>' +
            '    </div>' +
            '</div>';
    }
}
function _operation(value, rows, index) {
    var str = [];
    str.push("<a href='javascript:;' class='btn btn-xs btn-modify' title='修改' id=" + rows.typeId + "><span class='glyphicon glyphicon-pencil'></span></a>");
    str.push("<a href='javascript:;' class='btn btn-xs btn-remove' title='删除' id=" + rows.typeId + "><span class='glyphicon glyphicon-remove' style='color: red;'></span></a>");
    return str.join('&nbsp;');
}


// 导入excel
function _uploader_excel(buttonId, type) {
    var uploader = WebUploader.create({
        // 选完文件后，是否自动上传。
        auto: true,
        // swf文件路径
        swf: '/js/plugins/webuploader/Uploader.swf',
        // 文件接收服务端。
        server: '/ftx_excel/import',
        // 内部根据当前运行是创建，可能是input元素，也可能是flash.
        pick: '#' + buttonId,
        // 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
        resize: false,
        // 文件上传参数表，用来标记文件的所有者（如果是一篇文章的附件，就是文章的ID）
        formData: {"typTitle": type},
        //fileVal: 'uploadFile',
        // 单个文件大小限制（单位：byte），这里限制为 50M
        fileSingleSizeLimit: 50 * 1024 * 1024,
        // 只允许选择excel文件。
        accept: {
            title: 'excel',
            extensions: 'xls',
            mimeTypes: 'application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
        }
    });
    uploader.on('uploadBeforeSend', function (data) {
        $("#_file_name").html(data.name);
        $("#_uploda_jd_modal").modal('show');
    });
    uploader.on('uploadSuccess', function () {
        $("#_loader").hide();
        $("#_success").show();
        $("#_is_success").html("恭喜，数据导入成功！");
        $("#_tbgoods_table").bootstrapTable('refresh');
    });
}