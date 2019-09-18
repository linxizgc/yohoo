package com.yohoo.api.taobao;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.controller.BaseController;
import com.yohoo.taobao.bo.TbGoodsBo;
import com.yohoo.taobao.service.TbGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 产品类型
 *
 * @author LinXi
 * @date 2019年4月30日09:45:52
 */
@RestController
@RequestMapping(value = "/i/tb_goods", method = RequestMethod.POST)
public class I_TbGoodsController extends BaseController {

    @Autowired
    TbGoodsService goodsService;


    @RequestMapping("/list")
    public Map<String, Object> treeList(TbGoodsBo bo) {
        Map<String, Object> map = new HashMap<>();
        try {
            PageInfo<TbGoodsBo> goodsList = goodsService.getList_i(bo);
            map.put("rows", goodsList.getList());
            map.put("total", goodsList.getTotal());
        } catch (Exception e) {
            dealMapError(map, e);
        }
        return map;
    }
}