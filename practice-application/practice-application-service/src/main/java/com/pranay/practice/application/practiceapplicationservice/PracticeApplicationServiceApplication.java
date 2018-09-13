package com.pranay.practice.application.practiceapplicationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication
public class PracticeApplicationServiceApplication {

	@Autowired
	private SampleService service;

	public void run(String... args) throws Exception {
		SecurityContextHolder.getContext()
				.setAuthentication(new UsernamePasswordAuthenticationToken("pranay", "password",
						AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER")));
		try {
			System.out.println(this.service.secure());
		}
		finally {
			SecurityContextHolder.clearContext();
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplicationServiceApplication.class, args);
	}
}
