package com.vanaru.labs.dev.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringGithubLoginOAuth2SSoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGithubLoginOAuth2SSoApplication.class, args);
	}

}
