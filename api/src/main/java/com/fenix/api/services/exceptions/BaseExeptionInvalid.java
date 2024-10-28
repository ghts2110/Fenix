package com.fenix.api.services.exceptions;

import com.fenix.api.controller.exeption.Enum.ExceptionEnum;

public class BaseExeptionInvalid extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ExceptionEnum Enum;

    public BaseExeptionInvalid(String message, ExceptionEnum Enum) {
        super(message);
        this.Enum = Enum;
    }

    public ExceptionEnum getEnum() {
        return Enum;
    }
}
