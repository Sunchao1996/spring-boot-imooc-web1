package com.jianshu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * 使用mockmvc对系统的controller进行测试
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class StaffControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void list() throws Exception {
        //创建一个请求，并对请求后的数据进行断言
        mvc.perform(MockMvcRequestBuilders.get("/list"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
    }

}