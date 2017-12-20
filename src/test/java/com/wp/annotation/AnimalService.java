package com.wp.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 王萍
 * @date 2017/12/20 0020
 */
@Service
public class AnimalService {

    @Resource(name = "animalDao")
    private AnimalDao animalDao;

    public Map getAllAnimalsWithCount() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("animals", animalDao.getAll());
        map.put("count", animalDao.count());
        return map;
    }


}
