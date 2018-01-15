package com.jianshu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sunc on 2018/1/12.
 */
@RestController
public class StaffController {
    @Autowired
    private StaffDao staffDao;
    private  static Logger sysLog = LoggerFactory.getLogger("sysLog");
    @RequestMapping("/add")
    public String add(Staff staff) {
        staffDao.add(staff);
        sysLog.debug("12343");
        return "新增成功";
    }
    @RequestMapping("/delete")
    public String delete(Integer id) {
        staffDao.delete(id);
        return "删除成功";
    }
    @RequestMapping("/update")
    public String update(Staff staff) {
        staffDao.update(staff);
        return "更新成功";
    }
    @RequestMapping("/get")
    public Staff get(Integer id) {
        return staffDao.get(id);
    }
    @RequestMapping("/list")
    public List<Staff> list(){
        return staffDao.list();
    }
}
