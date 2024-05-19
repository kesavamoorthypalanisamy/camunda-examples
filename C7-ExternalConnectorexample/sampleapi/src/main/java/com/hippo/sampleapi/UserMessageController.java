package com.hippo.sampleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMessageController {
    
    @GetMapping("message/{msg}")
    public String firstMessage(@PathVariable(value = "msg") String message) {
        return "Hello " + message;
    }

    @PostMapping("anotherMessage")
    public String anotherMessage(@RequestBody MyMessage myMessage) {
        return myMessage.toString();
    }
    
}
