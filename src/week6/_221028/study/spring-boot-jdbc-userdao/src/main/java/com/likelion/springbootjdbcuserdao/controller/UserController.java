package com.likelion.springbootjdbcuserdao.controller;

import com.likelion.springbootjdbcuserdao.dao.UserDao;
import com.likelion.springbootjdbcuserdao.dto.user.UserReqDTO;
import com.likelion.springbootjdbcuserdao.dto.user.UserResDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResDTO> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(UserResDTO.form(userDao.findById(id)));
    }

    @PostMapping("")
    public ResponseEntity<Void> create(@RequestBody UserReqDTO dto) {
        userDao.add(dto.toEntity());
        return ResponseEntity.status(201).build(); // Created
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        userDao.deleteById(id);
        return ResponseEntity.status(204).build(); // No Contents
    }

    @DeleteMapping("/all")
    public ResponseEntity<Void> deleteAll() {
        userDao.deleteAll();
        return ResponseEntity.status(204).build(); // No Contents
    }
}
