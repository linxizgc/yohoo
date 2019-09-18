package com.yohoo.test;

import com.github.pagehelper.PageInfo;
import com.yohoo.product.bo.FtxTypeBo;
import com.yohoo.product.service.FtxTypeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * Created by kaikentule on 2019/5/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Autowired
    FtxTypeService typeService;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getGood() {
        System.err.println(12);
        PageInfo<FtxTypeBo> typeList = typeService.getTypeList(new FtxTypeBo());
        List<FtxTypeBo> list = typeList.getList();
        for (int i=0;i<list.size();i++){
            System.err.println(list.get(i).getTypeName());
        }

    }
}
