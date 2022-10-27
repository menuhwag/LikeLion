package com.springboot.hello.controller;

import com.springboot.hello.domain.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
    @PostMapping("")
    public String member(@RequestBody MemberDto dto) {
        return dto.toString();
    }
}
