package com.example.demo.exception;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Setter
@Getter
public class AppException extends RuntimeException{
    private ErrorCode errorCode;

    public AppException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
