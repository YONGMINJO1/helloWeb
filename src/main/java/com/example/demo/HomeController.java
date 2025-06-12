package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.ServletRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String index(ServletRequest request) {
        log.info("server port = {}", request.getServerPort());
        return "변경변경변경변경변경변경 Hello World... " + request.getServerPort();
    }
}

/*
 * 1. 개발자가 pc에서 진행하는 절처
 * 		1.  git commit
 *		2.  git push
 * 2.개발서버에서 진행하는 절차 ( 빌드 서버 )
 * 		1. docker build -t yongmin1/hello-web:latest .
 * 		2. docker push yongmin1/hello-web:latest
 * 		3.
 * 3. 운영서버에서 진행하는 절차
 * 		1. docker-compose down
 * 		2. dokker-compose pull
 * 		3. docker-compose up -d
 * 
 * 
 */
