package com.universal;

import org.springframework.beans.factory.annotation.Autowired;

public class Test1 {
	@Autowired
TestHelloService t1;
	
	public void run1() {
	System.out.println("hash "+ t1.hashCode());
	}
}
