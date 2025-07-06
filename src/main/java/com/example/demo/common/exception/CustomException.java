package com.example.demo.common.exception;

import com.example.demo.common.code.CInterface;
import com.example.demo.common.code.ErrorCode;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

    private final CInterface codeInterface;

    public CustomException(CInterface codeInterface) {
        super(codeInterface.getMessage());
        this.codeInterface = codeInterface;
    }

    public CustomException(CInterface codeInterface, String additionalMessage) {
        super(codeInterface.getMessage() + additionalMessage);
        this.codeInterface = codeInterface;
    }

}
