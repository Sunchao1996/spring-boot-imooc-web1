package com.jianshu;

import com.jianshu.Staff;
import com.jianshu.StaffDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Sunc on 2018/1/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {
    @Autowired
    private StaffDao staffDao;
    @Test
    public void restStaffDao(){
        System.out.println(staffDao.list());
        Assert.assertNotNull(staffDao.list());
    }
}
