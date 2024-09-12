package com.gn.reservation.config.security;

import java.io.IOException;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomAccessDeniedHandler implements AccessDeniedHandler{

	private String error_type;
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {

		String deniedUrl = "/error/"+error_type;
		response.sendRedirect(deniedUrl);
	}
	
	public void setErrorType(String error_type) {
		this.error_type = error_type;
	}
	
	

}
