package com.liyghting.actuator2demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping
@RestController
public class HelloController {

    @RequestMapping("hello")
    public ResponseEntity<Map> hello() {
        Map<String, String> map = new HashMap<>(1);
        map.put("hello", "world");
        return ResponseEntity.ok(map);
    }
}

