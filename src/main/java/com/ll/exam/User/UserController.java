package com.ll.exam.User;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/user") // 1
    public String getAddPage(User user){
        return "signup";
    }

    @PostMapping("/user") // 2
    public String addUser(@Valid User user, BindingResult result){

        if(result.hasErrors()){
            return "signup";
        }

        // 유효성 검사를 성공적으로 끝마쳤을 때 원하는 행동 구현

        return "complete";

    }
}