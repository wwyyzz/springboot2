package com.wj.boot.controller;


import com.wj.boot.bean.person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/person")
    @ResponseBody
    public person getPerson() {
        person person1 = new person();
        person1.setName("Tom");
        person1.setAge(18);

        return person1;
    }


    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader Map<String, String> header,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("inters") List<String> inters,
                                      @RequestParam Map<String,String> params,
                                      @CookieValue("_ga") String _ga,
                                      @CookieValue("_ga") Cookie cookie

    ) {
        Map<String, Object> map = new HashMap<>();

        map.put("id",id);
        map.put("username",name);
        map.put("pv",pv);

        map.put("headers", header);

        map.put("age", age);
        map.put("inters", inters);
        map.put("RequestParam", params);

        map.put("_ga", _ga);
        System.out.println(cookie.getName() + cookie.getValue());

        return map;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content) {
        Map<String, Object> map = new HashMap<>();
        map.put("content", content);

        return map;
    }
}
