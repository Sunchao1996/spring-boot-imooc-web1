package com.jianshu;

/**
 * Created by Sunc on 2018/1/12.
 */
public class Staff {
    //员工id
    private Integer id;
    //员工姓名
    private String name;

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
