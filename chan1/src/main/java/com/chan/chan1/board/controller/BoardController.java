package com.chan.chan1.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/free/list")
    public String freeList(){

        return "board/free/freeList";
    }

    @GetMapping("/question/list")
    public String questionList(){

        return "board/question/questionList";
    }

    @GetMapping("/free/add")
    public String freeAdd(){

        return "board/free/freeForm";
    }

    @GetMapping("/question/add")
    public String questionAdd(){

        return "board/question/questionForm";
    }

}
