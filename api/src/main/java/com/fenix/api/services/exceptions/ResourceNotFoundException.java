package com.fenix.api.services.exceptions;

import com.fenix.api.controller.exeption.Enum.ExceptionEnum;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	ExceptionEnum Enum;

	public ResourceNotFoundException(Object id, ExceptionEnum Enum) {//basicamente quando ocorrer esse erro, vai aparecer essa menssagem
		super("Resource not found. Id " + id);
		this.Enum = Enum;
	}
	public ExceptionEnum getEnum() {
		return Enum;
	}
}
