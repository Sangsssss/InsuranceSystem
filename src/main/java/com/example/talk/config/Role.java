package com.example.talk.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 나중에 다룰 role이 많아지면 사용할 클래스. 아직은 사용 중 아님.
@AllArgsConstructor
@Getter
public enum Role {
    SUPERADMIN("ROLE_SUPERADMIN,ROLE_ADMIN"),
    ADMIN("ROLE_ADMIN");

    private String value;
}