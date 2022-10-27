package com.springboot.hello.controller;

import com.springboot.hello.domain.dto.MemberDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
    @PostMapping("")
    public ResponseEntity<MemberDto> member(@RequestBody MemberDto dto) {
        return ResponseEntity.ok(dto);
    }
}
