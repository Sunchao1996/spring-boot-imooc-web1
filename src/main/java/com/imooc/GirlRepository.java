package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Sunc on 2018/1/12.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<Girl> findByAge(Integer age);
}
