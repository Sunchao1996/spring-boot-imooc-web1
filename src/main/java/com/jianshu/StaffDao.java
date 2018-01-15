package com.jianshu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sunc on 2018/1/12.
 */
@Repository
public class StaffDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(Staff staff) {
        return jdbcTemplate.update("insert into staff(name) values (?)", staff.getName());
    }

    public int update(Staff staff) {
        return jdbcTemplate.update("update staff set name=? where id= ?", staff.getName(), staff.getId());
    }

    public Staff get(int id) {
        List<Staff> list = jdbcTemplate.query("select * from staff where id=?", new Object[]{id}, new BeanPropertyRowMapper(Staff.class));
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public List<Staff> list() {
        return jdbcTemplate.query("select * from staff", new Object[]{}, new BeanPropertyRowMapper<>(Staff.class));
    }

    public int delete(Integer id) {
        return jdbcTemplate.update("delete from staff where id =?", id);
    }
}
