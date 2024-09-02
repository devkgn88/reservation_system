package com.gn.reservation.config.security;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
//		HttpSession session = request.getSession();
//		if(session.isNew() || session.getAttribute("loginedAccount") == null) {
//			session.setAttribute("loginedAccount", "몰라");
//			session.setMaxInactiveInterval(5);
//		}
		
		response.sendRedirect("/");
	}

}
