package com.codegym.controller;

import com.codegym.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("/shop-me")
public class Ui_PostsDetailController {

    @Autowired
    private PostServiceImpl postService;

    @GetMapping("{id}/post-detail")
    public String showPost(@PathVariable Integer id, Model model) throws SQLException {
        model.addAttribute("post",postService.findById(id).get());
        return "home-page/post-detail";
    }
}
