package com.amazon.profile.controller.exception;

public class ProfileAlreadyRegisteredException extends RuntimeException {

	public ProfileAlreadyRegisteredException(String _message) {
		super(_message);
	}

}
