package com.universal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class TestHelloService implements TestService {
@Autowired
TestHelloService t;


@Autowired
Test1 t1;

public void show() {
	System.out.println("hello" + t.hashCode());
	 t1.run1();
}

@Override
public void hello() {
	show();
	
}

}
