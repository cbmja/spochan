package com.chan.chan1.board.controller;

import com.chan.chan1.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor

public class BoardController {

    private final MenuConfig menu;
    
    @GetMapping("/free/list")
    public String freeList(Model model){
        config(model);
        return "board/free/freeList";
    }

    @GetMapping("/question/list")
    public String questionList(Model model){
        config(model);
        return "board/question/questionList";
    }

    @GetMapping("/free/add")
    public String freeAdd(Model model){
        config(model);
        return "board/free/freeForm";
    }

    @GetMapping("/question/add")
    public String questionAdd(Model model){
        config(model);
        return "board/question/questionForm";
    }

    public void config(Model model){
        Map<String, String> subMenus = menu.getBoardMenu();
        model.addAttribute("subMenus" , subMenus);
        model.addAttribute("title" , "게시판");

    }
    
}
