package com.jianshu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sunc on 2018/1/12.
 */
@RestController
public class JianshuController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
