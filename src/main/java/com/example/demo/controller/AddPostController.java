package com.example.demo.controller;

import com.example.demo.entity.DTO.PostDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class AddPostController {
    @PostMapping("/add")
    public String add(@RequestBody PostDTO post){
        return "add_post.html";
    }
}
