
package es.palma.demoresetbundle;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class DemoApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public MessageSource messageSource() {
		ImiMessageSource messageSource = new ImiMessageSource();
		return messageSource;
	}
	
	
	@Bean
	public LocaleResolver localeResolver(Environment env) {
		SessionLocaleResolver slr=new SessionLocaleResolver();
		slr.setDefaultLocale(new Locale("ca"));
		return slr;
	}
	
	@Bean 
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
		
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}
	

}
