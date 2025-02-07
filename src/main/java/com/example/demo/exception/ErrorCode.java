package com.example.demo.exception;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ErrorCode {
    USER_EXISTED(1003,"user existed"),
    PASSWORD_INVALID(1004,"password must be at least 8 chars"),
    USER_NOT_FOUND(1005,"User not existed")
    ;
    int code;
    String message;

    ErrorCode() {
    }

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
