package com.jianshu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Sunc on 2018/1/13.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMongodb {
    @Autowired
    private StaffRepository staffRepository;

    @Test
    public void test(){
        //删除所有数据
        staffRepository.deleteAll();

        //插入数据
        staffRepository.save(new MongodbStaff("张三"));
        staffRepository.save(new MongodbStaff("李四"));

        //查询所有数据
        System.out.println("查询所有数据：");
        System.out.println("---------------------------------------");
        for(MongodbStaff mongodbStaff:staffRepository.findAll()){
            System.out.println(mongodbStaff);
        }
        System.out.println("按姓名查询");
        System.out.println("---------------------------------------");
        System.out.println(staffRepository.findByName("李四"));
    }
}
