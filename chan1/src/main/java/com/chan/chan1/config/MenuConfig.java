package com.chan.chan1.config;


import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
public class MenuConfig {


    private  Map<String, String> adminMenu = new HashMap<>();
    private  Map<String, String> testMenu = new HashMap<>();
    private  Map<String, String> boardMenu = new HashMap<>();
    private  Map<String, String> noticeMenu = new HashMap<>();
    private  Map<String, String> myPageMenu = new HashMap<>();

     {

         adminMenu.put("시험지 등록","/admin/upload");
         adminMenu.put("시험지 목록","/admin/list");

         testMenu.put("시험 목록","/test/list");
         testMenu.put("답안 목록","/answer/list");

         boardMenu.put("자유게시판","/board/free/list");
         boardMenu.put("질문게시판","/board/question/list");

         noticeMenu.put("QnA","/notice/qna/list");
         noticeMenu.put("FaQ","/notice/faq/list");

         myPageMenu.put("탈퇴","/myPage/delete");
         myPageMenu.put("최근 푼 문제","/myPage/recent");
         myPageMenu.put("통계","/myPage/statistic");

    }

    public Map<String, String> getAdminMenu() {

         return this.adminMenu;
    }
}
