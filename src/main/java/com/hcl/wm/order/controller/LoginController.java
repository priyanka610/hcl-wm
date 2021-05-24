package com.hcl.wm.order.controller;

import com.hcl.wm.order.dto.OrderDto;
import com.hcl.wm.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {


    @GetMapping
    String login() {
        return "login successful";
    }

    @GetMapping("/logout")
    String logout() {
        return "logout";
    }
}
