package com.gn.reservation.config.security;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
	
	String[] staticResources = {
			"/vendors/**"
	};
	
	@Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(requests ->
			requests.requestMatchers(staticResources).permitAll()
					.anyRequest().authenticated())
		.formLogin(login ->
			login.loginPage("/login")
				.loginProcessingUrl("/login")
				.usernameParameter("account_id")
				.passwordParameter("account_pw")
				.permitAll()
				.successHandler(new LoginSuccessHandler())
				.failureHandler(new LoginFailureHandler()))
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
//	@Bean
//	WebSecurityCustomizer webSecurityCustomizer() {
//		return (web -> web
//				.ignoring()
//				.requestMatchers("/vendors/**")
//				);
//	}

}
