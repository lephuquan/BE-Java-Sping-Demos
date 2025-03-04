package com.lephuquan.dev.demo_attributes_in_entities.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //Cần controller để giữ ứng dụng không tắt sau khi chạy
    @GetMapping("/test")
    public String test() {
        return "Ứng dụng đang chạy!";
    }
}
