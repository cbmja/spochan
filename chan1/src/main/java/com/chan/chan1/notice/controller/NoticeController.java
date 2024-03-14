package com.chan.chan1.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("/qna/list")
    public String qnaList(){

        return "notice/QnA/QnAList";
    }
}
