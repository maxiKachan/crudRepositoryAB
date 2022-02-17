package com.kachan.controller;

import com.kachan.entity.User;
import com.kachan.repository.JpaUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    JpaUserRepository jpaUserRepository;

    public UserController(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @GetMapping
    public String getAllUsers(Model model){
        log.info("getAllUsers");
        List<User> users = jpaUserRepository.findAll();
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping()
    public String saveUser(@RequestParam Map<String, String> param){
        User user = new User(param.get("surname"), param.get("firstname"), param.get("patronymic"),
                param.get("phoneNumber"));
        jpaUserRepository.save(user);
        return "index";
    }
}
