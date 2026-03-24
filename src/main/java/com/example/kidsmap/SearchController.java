package com.example.kidsmap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    // 테스트용 엔드포인트
    @GetMapping("/test")
    public String test() {
        return "서버 정상 동작";
    }
}