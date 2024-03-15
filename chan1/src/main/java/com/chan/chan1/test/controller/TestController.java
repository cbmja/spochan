package com.chan.chan1.test.controller;

import com.chan.chan1.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor

public class TestController {
    private final MenuConfig menu;

    @GetMapping("test/list")
    public String testList(Model model){
        config(model);
        return "test/testList";
    }

    @GetMapping("answer/list")
    public String answerList(Model model){
        config(model);
        return "test/answerList";
    }

    public void config(Model model){
        Map<String, String> subMenus = menu.getTestMenu();
        model.addAttribute("subMenus" , subMenus);
        model.addAttribute("title" , "시험");

    }

}
