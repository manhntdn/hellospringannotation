package org.o7planning.spring.lang.impl;

import org.o7planning.spring.lang.Language;

public class English implements Language{

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public String getBye() {
		// TODO Auto-generated method stub
		return "Good bye!!!";
	}

}
