package io.javabrains;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@RequestMapping("/")
public String show() {
	return "hello djjd";
}
}
