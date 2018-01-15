package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sunc on 2018/1/11.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(@RequestParam(value="id",required = false,defaultValue = "0") Integer myid) {
        return "id:"+myid;
    }
//    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
//    public String say(@PathVariable("id") Integer id) {
//        return "id:"+id;
//    }
//    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
//    public String say() {
//        return girlProperties.getCupSize();
//    }
}
