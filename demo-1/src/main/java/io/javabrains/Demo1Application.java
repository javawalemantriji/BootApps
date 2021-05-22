package io.javabrains;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Demo1Application.class);
	    app.setBannerMode(Mode.OFF); // Disable banner
	    app.run(args);
	}

}
