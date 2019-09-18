$(function () {
    _loadTable();

    //保存
    $('#_tbbanner_from').ajaxForm({
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
                $('#_tbbanner_modal').modal('hide');
                $('#_tbbanner_from').clearForm(true);
                $("#_tbbanner_table").bootstrapTable('refresh');
            } else {
                ftxmsg.t_error(result.message);
            }
        }
    });
    //详情
    $(document).on('click', '.btn-modify', function () {
        $.get('/tb_banner/findById', {
            typeId: $(this).attr("id")
        }, function (result) {
            $('#_tbbanner_modal').modal('show');
            $('#_tbbanner_from').loadJSON(result.record);
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
            $.get('/tb_banner/remove', {
                typeId: typeId
            }, function (result) {
                if (result.success) {
                    $("#_tbbanner_table").bootstrapTable('refresh');
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
        $('#_tbbanner_from').clearForm(true);
    });
});

function _loadTable() {
    $("#_tbbanner_table").bootstrapTable('destroy');
    $("#_tbbanner_table").bootstrapTable({
        url: "/tb_banner/list",
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
    requestParams.banTitle = $("#key_word").val();
    return requestParams;
}
function _status_css3(value) {
    if (value == 1) {
        return  '<div class="switch">'+
                '    <div class="onoffswitch">'+
                '        <input type="checkbox" checked="" class="onoffswitch-checkbox" id="example1">'+
                '        <label class="onoffswitch-label" for="example1">'+
                '        <span class="onoffswitch-inner"></span>'+
                '        <span class="onoffswitch-switch"></span>'+
                '        </label>'+
                '    </div>'+
                '</div>';
    } else {
        return  '<div class="switch">'+
                '    <div class="onoffswitch">'+
                '        <input type="checkbox" class="onoffswitch-checkbox" id="example2">'+
                '        <label class="onoffswitch-label" for="example2">'+
                '        <span class="onoffswitch-inner"></span>'+
                '        <span class="onoffswitch-switch"></span>'+
                '        </label>'+
                '    </div>'+
                '</div>';
    }
}
function _operation(value, rows, index) {
    var str = [];
    str.push("<a href='javascript:;' class='btn btn-xs btn-modify' title='修改' id=" + rows.typeId + "><span class='glyphicon glyphicon-pencil'></span></a>");
    str.push("<a href='javascript:;' class='btn btn-xs btn-remove' title='删除' id=" + rows.typeId + "><span class='glyphicon glyphicon-remove' style='color: red;'></span></a>");
    return str.join('&nbsp;');
}