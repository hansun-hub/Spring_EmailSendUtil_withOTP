package com.example.demo.common.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode{
    NOT_VALID_EMAIL_REQUEST(-1, "잘못된 이메일 형식입니다.");

    private final Integer code;
    private final String message;
    
    ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
