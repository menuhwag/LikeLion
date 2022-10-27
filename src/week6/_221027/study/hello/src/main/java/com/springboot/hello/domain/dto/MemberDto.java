package com.springboot.hello.domain.dto;

public class MemberDto {
    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
