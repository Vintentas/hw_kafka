package com.example.demo.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
@RequiredArgsConstructor
public class SendlerController {

    private final SendlerService sendlerService;


    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void send() {
        for (int i = 0; i < 10; i++) {

            String key = String.valueOf(i);
            String message = String.valueOf(Math.random() * 10000 + 1);

            sendlerService.send(key, message);
        }
    }


}
