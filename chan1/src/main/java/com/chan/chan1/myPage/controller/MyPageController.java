package com.chan.chan1.myPage.controller;

import com.chan.chan1.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/myPage")
@RequiredArgsConstructor

public class MyPageController {

    private final MenuConfig menu;


    @GetMapping("/statistic")
    public String statistic(Model model){
        config(model);
        return "myPage/statistic";
    }
    @GetMapping("/recent")
    public String recent(Model model){
        config(model);
        return "myPage/recent";
    }
    @GetMapping("/delete")
    public String delete(Model model){
        config(model);
        return "myPage/delete";
    }

    public void config(Model model){
        Map<String, String> subMenus = menu.getMyPageMenu();
        model.addAttribute("subMenus" , subMenus);
        model.addAttribute("title" , "마이페이지");

    }

}
