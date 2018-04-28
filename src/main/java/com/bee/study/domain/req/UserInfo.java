package com.bee.study.domain.req;

import com.bee.study.controller.validate.PasswordError;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class UserInfo {

    public interface Login {
    }

    public interface Register {
    }

    @NotNull(groups = {Login.class})
    @Null(groups = {Register.class})
    private String name;

    @NotNull(groups = {Login.class})
    @Null(groups = {Register.class})
    @PasswordError(groups = {Login.class, Register.class})
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
