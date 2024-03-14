package com.chan.chan1.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String dataList(){

        return "admin/dataList";
    }

    @GetMapping("/upload")
    public String uploadData(){

        return "admin/dataUpload";
    }

}
