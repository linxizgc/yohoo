$(function () {
    _loadTable();
    _uploader("filePicker", "fileList", "logo");

    //保存
    $('#_type_from').ajaxForm({
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
                $('#_type_modal').modal('hide');
                $('#_type_from').clearForm(true);
                $("#_type_table").bootstrapTable('refresh');
            } else {
                ftxmsg.t_error(result.message);
            }
        }
    });
    //详情
    $(document).on('click', '.btn-modify', function () {
        $.get('/ftx_type/findById', {
            typeId: $(this).attr("id")
        }, function (result) {
            $('#_type_modal').modal('show');
            $('#_type_from').loadJSON(result.record);
            $("#fileList").html("");
            if(result.record.fullPath){
                $("#fileList").html("<div class=\"swiper-slide\">" +
                    "<img data-type='ckImg' src='" + result.record.fullPath + "' style='width: 100%;'/>");
            }
        });
    });
    //删除
    $(document).on('click', '.btn-remove', function () {
        var typeId = $(this).attr("id");
        ftxmsg.del(function () {
            $.get('/ftx_type/remove', {
                typeId: typeId
            }, function (result) {
                if (result.success) {
                    $("#_type_table").bootstrapTable('refresh');
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
    $('#_add_btn').click(function (){
        $('#_type_from').clearForm(true);
    });
});

function _loadTable() {
    $("#_type_table").bootstrapTable('destroy');
    $("#_type_table").bootstrapTable({
        url: "/ftx_type/list",
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
    requestParams.typeName = $("#key_word").val();
    return requestParams;
}

function _operation(value, rows, index) {
    var str = [];
    str.push("<a href='javascript:;' class='btn btn-xs btn-modify' title='修改' id=" + rows.typeId + "><span class='glyphicon glyphicon-pencil'></span></a>");
    str.push("<a href='javascript:;' class='btn btn-xs btn-remove' title='删除' id=" + rows.typeId + "><span class='glyphicon glyphicon-remove' style='color: red;'></span></a>");
    return str.join('&nbsp;');
}