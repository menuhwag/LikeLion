package com.likelion.springbootjdbcuserdao.dto.user;

import com.likelion.springbootjdbcuserdao.domain.User;
import lombok.Getter;

@Getter
public class UserReqDTO {
    private String id;
    private String name;
    private String password;

    public User toEntity() {
        return new User(id, name, password);
    }
}
