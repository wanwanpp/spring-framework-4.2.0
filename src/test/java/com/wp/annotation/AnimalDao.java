package com.wp.annotation;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王萍
 * @date 2017/12/20 0020
 */
@Repository
public class AnimalDao {

    public static List<Animal> animals = new ArrayList<>();

    static {
        animals.add(new Animal("天鹅", 6));
        animals.add(new Animal("喜鹊", 4));
        animals.add(new Animal("长颈鹿", 5));
        animals.add(new Animal("大象", 3));
        animals.add(new Animal("老虎", 2));
    }

    public List<Animal> getAll() {
        return animals;
    }

    public boolean save(Animal animal) {
        animals.add(animal);
        return true;
    }
}
