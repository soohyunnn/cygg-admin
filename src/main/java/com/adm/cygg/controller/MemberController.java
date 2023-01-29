package com.adm.cygg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/member")
    public String memberList() {
        return "member/list";
    }

}
