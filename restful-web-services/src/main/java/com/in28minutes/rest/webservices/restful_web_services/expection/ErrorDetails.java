package com.in28minutes.rest.webservices.restful_web_services.expection;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime timestamp;
	
	private String message;
	
	private String details;

	public ErrorDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	@Override
	public String toString() {
		return "ErrorDetails [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}
}

