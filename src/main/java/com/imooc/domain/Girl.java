package com.imooc.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by Sunc on 2018/1/11.
 */
@Entity
@ScriptAssert(groups = {Girl.Check.class},lang = "javascript",script = "com.imooc.domain.Girl.checkCupSize(_this.cupSize)")
public class Girl {
    public interface CupSize{}
    public interface Check{}

    public static boolean checkCupSize(String cupSize){
        if(cupSize.equals("F")){
            return true;
        }else{
            return false;
        }
    }

    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty(groups = {CupSize.class})
    private String cupSize;
    @Max(value = 10,message = "111",groups = {CupSize.class})
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
