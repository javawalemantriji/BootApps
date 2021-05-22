package com.universal;

import java.beans.BeanProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
@Bean
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public TestHelloService getTestHelloService() {
	return new TestHelloService();
}
@Bean
public Test1 getTestHelloService1() {
	return new Test1();
}
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	getTestHelloService().hello();
}
}
