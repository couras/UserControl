package br.cubas.usercontrol;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class UsercontrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsercontrolApplication.class, args);
	}
	
	@Bean
	public SessionLocaleResolver localeResolver() {
	    SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
	    sessionLocaleResolver.setDefaultLocale(new Locale ("pt", "BR"));
	    return sessionLocaleResolver;
	}
}
