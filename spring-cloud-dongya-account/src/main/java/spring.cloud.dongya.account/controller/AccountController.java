package spring.cloud.dongya.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController{

    @GetMapping
    public String getName(@RequestParam("Id") Long id) {
        return "刘东亚hah";
    }
}
