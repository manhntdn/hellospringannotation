package org.o7planning.spring.config;

import org.o7planning.spring.lang.Language;
import org.o7planning.spring.lang.impl.Chinese;
import org.o7planning.spring.lang.impl.English;
	import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.o7planning.spring.bean" })
public class AppConfiguration {
	@Bean(name = "language")
	public Language getLanguage() {
		return new English();
	}
	
	@Bean(name = "language1")
	public Language getLanguage1(){
		return new Chinese();
	}
}
