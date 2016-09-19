package io.pivotal.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class OAuthResourceServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(OAuthResourceServerApplication.class, args);
	}
}
