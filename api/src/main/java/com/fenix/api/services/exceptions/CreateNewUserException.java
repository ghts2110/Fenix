package com.fenix.api.services.exceptions;

import com.fenix.api.controller.exeption.Enum.ExceptionEnum;

public class CreateNewUserException extends BaseExeptionInvalid {
	private static final long serialVersionUID = 1L;
    ExceptionEnum Enum;

    public CreateNewUserException(String msg, ExceptionEnum Enum){
        super(msg, Enum);
    }
}
