package org.o7planning.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	@Autowired
	private MyRepository myRepository;
	
	public void showApp() {
		System.out.println("Now is: "+ myRepository.getSystemDateTime());
		System.out.println("App name: "+ myRepository.getAppName());
	}
}
