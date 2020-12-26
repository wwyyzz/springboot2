package com.wj.boot.Controller;

import com.wj.boot.bean.Car;
import com.wj.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    Car car;

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, SpringBoot 2!";
    }

    @RequestMapping("/car")
    public Car car() {
        log.info("car :" + car);
        return car;
    }

    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}
