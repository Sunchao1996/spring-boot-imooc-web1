package com.jianshu;

import javax.persistence.Id;

/**
 * Created by Sunc on 2018/1/13.
 */
public class MongodbStaff {
    @Id
    //如果属性名和文档中key值对应，则会获取到对应的值
    private String _id;
    private String name;

    public MongodbStaff(String name) {
        this.name = name;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MongodbStaff{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
