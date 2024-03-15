package com.chan.chan1.admin.controller;

import com.chan.chan1.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final MenuConfig menu;



    @GetMapping("/list")
    public String dataList(Model model){
        config(model);
        return "admin/dataList";
    }

    @GetMapping("/upload")
    public String uploadData(Model model){
        config(model);
        return "admin/dataUpload";
    }

    public void config(Model model){
        Map<String, String> subMenus = menu.getAdminMenu();
        model.addAttribute("subMenus" , subMenus);
        model.addAttribute("title" , "관리자페이지");

    }


}
