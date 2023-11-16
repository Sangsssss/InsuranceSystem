package com.example.talk.model.dto;

import com.example.talk.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SignUpForm {
    private String name;
    private String email;
    private String password;
    private String role;

//    private String rrn;
//    private int age;
//    private String bankAccount;
//    private Date birthDate;
//    private String gender;
//    private String phoneNum;
//    private String occupation;

    public Account toEntity() {
        return new Account(name, email, password, role);
    }


}
