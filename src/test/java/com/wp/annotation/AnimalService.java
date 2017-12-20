package com.wp.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王萍
 * @date 2017/12/20 0020
 */
@Service
public class AnimalService {

    @Resource(name = "animalDao")
    private AnimalDao animalDao;
}
