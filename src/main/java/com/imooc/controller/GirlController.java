package com.imooc.controller;

import com.imooc.domain.Girl;
import com.imooc.exception.GirlException;
import com.imooc.repository.GirlRepository;
import com.imooc.service.GirlService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Sunc on 2018/1/12.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    /*获取全部女生
    * */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() throws RuntimeException{
        throw  new GirlException(100,"222");
    }
    /*
    * 添加女生
    * */
    @PostMapping("/girls")
    public Girl girlAdd(@Validated(Girl.Check.class) Girl girl) {
        return girlRepository.save(girl);
    }

    /*通过id查询一个女生
     *
     */
    @GetMapping("/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    /*更新一个女生
     */
//    @PutMapping("/girls/{id}")
//    public Girl girlUpdate(@PathVariable("id") Integer id,@RequestParam("cupSize") String cupSize,@RequestParam("age")Integer age){
//        Girl girl = new Girl();
//        girl.setId(id);
//        girl.setCupSize(cupSize);
//        girl.setAge(age);
//        return girlRepository.save(girl);
//    }
    /*更新一个女生
     */
    @PutMapping("/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id, Girl girl) {
        girl.setId(id);
        return girlRepository.save(girl);
    }
    /*删除一个女生*/
    @DeleteMapping("/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    /*根据年龄获取女生*/
    @GetMapping("/girls/age/{age}")
    public List<Girl> girlListAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    /*事务*/
    @GetMapping("/girl/two")
    public void girlTwo(){
        girlService.two();
    }
}
