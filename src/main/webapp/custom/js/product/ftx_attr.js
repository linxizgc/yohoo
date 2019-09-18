$(function () {
    _loadBigMenus();
    _loadTable();
    _uploader("filePicker", "fileList", "logo");

    //大属性保存
    $('#_big_from').ajaxForm({
        beforeSubmit: function () {
            var bigAttrName = $('#bigAttrName').val();
            if (bigAttrName == "") {
                ftxmsg.t_warning("类属性称不能为空");
                return false;
            }
        },
        success: function (result) {
            if (result.success) {
                ftxmsg.t_success();
                $('#_big_modal').modal('hide');
                $('#_big_from').clearForm(true);
                _loadBigMenus();
                _loadTable();
            } else {
                ftxmsg.t_error(result.message);
            }
        }
    });

    //小属性保存
    $('#_small_from').ajaxForm({
        beforeSubmit: function () {
            var smallAttrName = $('#smallAttrName').val();
            if (smallAttrName == "") {
                ftxmsg.t_warning("属性名称不能为空");
                return false;
            }
        },
        success: function (result) {
            if (result.success) {
                ftxmsg.t_success();
                $('#_small_modal').modal('hide');
                $('#_small_from').clearForm(true);
                _loadTable();
                // $("#_small_table").bootstrapTable('refresh');
            } else {
                ftxmsg.t_error(result.message);
            }
        }
    });
    //大类型点击
    $(document).on('click', '._big_m', function () {
        $('#_click_bigAttrId').val($(this).attr('id'));
        $("#_big_menus").find("li").each(function () {
            $(this).attr("style", "padding-left:2rem;height: 4rem;line-height: 4rem;")
        })
        $(this).parent().parent().attr("style", "padding-left:2rem;height: 4rem;line-height: 4rem;background-color: #fff;");
        _loadTable();
    });
    //大详情
    $(document).on('click', '.big-modify', function () {
        $.get('/ftx_big_attr/findById', {
            bigAttrId: $(this).attr("id")
        }, function (result) {
            $('#_big_modal').modal('show');
            $('#_big_from').loadJSON(result.record);
        });
    });
    //大删除
    $(document).on('click', '.big-del', function () {
        var bigAttrId = $(this).attr("id");
        ftxmsg.del(function () {
            $.get('/ftx_big_attr/remove', {
                bigAttrId: bigAttrId
            }, function (result) {
                if (result.success) {
                    _loadBigMenus();
                    _loadTable();
                    swal("", "您已经永久删除了这条信息。", "success");
                } else {
                    ftxmsg.tip(result.message);
                }
            });
        })
    });
    //小详情
    $(document).on('click', '.btn-modify', function () {
        $.get('/ftx_small_attr/findById', {
            smallAttrId: $(this).attr("id")
        }, function (result) {
            $('#_small_modal').modal('show');
            $('#_small_from').loadJSON(result.record);
        });
    });
    //小删除
    $(document).on('click', '.btn-remove', function () {
        var smallAttrId = $(this).attr("id");
        ftxmsg.del(function () {
            $.get('/ftx_small_attr/remove', {
                smallAttrId: smallAttrId
            }, function (result) {
                if (result.success) {
                    _loadTable();
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
        $('#_small_from').clearForm(true);
    });
});

function _loadBigMenus() {
    $.ajax({
        type: "post",
        url: "/ftx_big_attr/allList",
        async: false,
        success: function (data) {
            console.log(data.rows);
            if (data.success) {
                $('#_big_menus').html("");
                var html = [];
                html.push("<option value='-1'>请选择上级分类</option>");
                $.each(data.rows, function (i, ob) {
                    var li = '';
                    if (0 == i) {
                        $('#_click_bigAttrId').val(ob.bigAttrId);
                        li = '<li style="padding-left:2rem;height: 4rem;line-height: 4rem;background-color: #fff;">';
                    } else {
                        li = '<li style="padding-left:2rem;height: 4rem;line-height: 4rem;">';
                    }
                    li = li + '<div style="display: flex;justify-content: space-between;">' +
                        '<a href="javascript:;" class="_big_m" style="width: 60%;" id="' + ob.bigAttrId + '"><i class="fa fa-coffee"></i> ' + ob.bigAttrName + '</a>' +
                        '<div class="_edit_del">' +
                        '<a href="javascript:;" class="big-modify" id="' + ob.bigAttrId + '" style="float: left;" title="修改"><span style="color: #999c9e;" class="glyphicon glyphicon-pencil"></span>&nbsp;</a>' +
                        '&nbsp;&nbsp;&nbsp;&nbsp;' +
                        '<a href="javascript:;" class="big-del" id="' + ob.bigAttrId + '" style="float: left;" title="删除"><span style="color: #999c9e;" class="glyphicon glyphicon-remove"></span>&nbsp;</a>' +
                        '</div></div></li>';
                    $('#_big_menus').append(li);
                    html.push("<option value='" + ob.bigAttrId + "'>" + ob.bigAttrName + "</option>");
                });
                $("#parentAttrId").html(html.join());
            }
        }
    });
}
function _loadTable() {
    $("#_small_table").bootstrapTable('destroy');
    $("#_small_table").bootstrapTable({
        url: "/ftx_small_attr/list",
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
    requestParams.smallAttrName = $("#key_word").val();
    requestParams.parentAttrId = $('#_click_bigAttrId').val();
    return requestParams;
}

function _operation(value, rows, index) {
    var str = [];
    str.push("<a href='javascript:;' class='btn btn-xs btn-modify' title='修改' id=" + rows.smallAttrId + "><span class='glyphicon glyphicon-pencil'></span></a>");
    str.push("<a href='javascript:;' class='btn btn-xs btn-remove' title='删除' id=" + rows.smallAttrId + "><span class='glyphicon glyphicon-remove' style='color: red;'></span></a>");
    return str.join('&nbsp;');
}