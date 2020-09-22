package com.rest.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DepartmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DepartmentNotFoundException(String message) {
		super(message);
	}

}
