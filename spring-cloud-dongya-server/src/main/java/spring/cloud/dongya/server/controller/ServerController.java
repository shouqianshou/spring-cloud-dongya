package spring.cloud.dongya.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.dongya.server.client.AccountClient;

@RestController
@RequestMapping("/spring-cloud")
public class ServerController {


    @Autowired
    private AccountClient accountClient;

    @GetMapping("/name")
    public String getName(@RequestParam("Id") Long id) {
        return accountClient.getName(id);
    }

}

