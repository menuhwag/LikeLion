package com.likelion.springbootjdbcuserdao.dto.user;

import com.likelion.springbootjdbcuserdao.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserResDTO {
    private String id;
    private String name;

    public static UserResDTO form(User user) {
        return new UserResDTO(user.getId(), user.getName());
    }
}
