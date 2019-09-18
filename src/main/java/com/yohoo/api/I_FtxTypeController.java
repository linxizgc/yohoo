package com.yohoo.api;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.controller.BaseController;
import com.yohoo.product.bo.FtxTypeBo;
import com.yohoo.product.service.FtxTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 产品类型
 *
 * @author LinXi
 * @date 2019年3月27日09:45:52
 */
@Controller
@RequestMapping(value = "/i/ftx_type", method = RequestMethod.POST)
public class I_FtxTypeController extends BaseController {

    @Autowired
    FtxTypeService typeService;


    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> treeList(FtxTypeBo bo) {
        Map<String, Object> map = new HashMap<>();
        try {
            PageInfo<FtxTypeBo> typeList = typeService.getTypeList(bo);
            map.put("rows", typeList.getList());
            map.put("total", typeList.getTotal());
        } catch (Exception e) {
            dealMapError(map, e);
        }
        return map;
    }
}