package com.caetasousa.course.services.exeptions;

public class ResourseNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException(Object id) {
		super("Resource not found. id " + id);
	}
}
