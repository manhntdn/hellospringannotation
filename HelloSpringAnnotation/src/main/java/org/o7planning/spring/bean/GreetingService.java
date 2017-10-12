package org.o7planning.spring.bean;

import org.o7planning.spring.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	@Autowired
	private Language language;
	
	public GreetingService() {
		// TODO Auto-generated constructor stub
	}
	
	public void sayGreeting(){
		String greeting = language.getGreeting();
		
		System.out.println("Greeting: "+greeting);
	}
	int a;
}
