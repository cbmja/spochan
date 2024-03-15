package com.chan.chan1.notice.controller;

import com.chan.chan1.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/notice")
@RequiredArgsConstructor

public class NoticeController {
    private final MenuConfig menu;

    @GetMapping("/qna/list")
    public String qnaList(Model model){
        config(model);
        return "notice/QnA/QnAList";
    }

    @GetMapping("/faq/list")
    public String faqList(Model model){
        config(model);
        return "notice/FaQ/FaqList";
    }

    public void config(Model model){
        Map<String, String> subMenus = menu.getNoticeMenu();
        model.addAttribute("subMenus" , subMenus);
        model.addAttribute("title" , "공지");

    }

}
