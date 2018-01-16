package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Sunc on 2018/1/12.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void two(){
        Girl g1 = new Girl();
        g1.setCupSize("D");
        g1.setAge(10);
        girlRepository.save(g1);

        Girl g2 = new Girl();
        g2.setCupSize("Fffffff");
        g2.setAge(22);
        girlRepository.save(g2);
    }
}
