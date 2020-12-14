package com.sunil.springeducation.route;

import com.sunil.springeducation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserRoute {

    private final UserService userService;

    @Autowired
    public UserRoute(UserService userService) {
        this.userService = userService;
    };

    @GetMapping("")
    public void getUser() {
        this.userService.findAll();
    };

    @GetMapping("/initialize")
    public void initializers() {
        this.userService.initializeUsers();
    };
}