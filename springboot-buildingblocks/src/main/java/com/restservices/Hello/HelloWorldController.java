package com.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	
	//RI- /helloworld
	//@RequestMapping(method = RequestMethod.GET,path="/helloworld")
	@GetMapping("/helloworld")
	public String HelloWorld() {
		return "Hello world using GetMapping";
	}
	
	@GetMapping("/hello-world-bean")
	public UserDetails helloWorldBean() {
		
		return new UserDetails("APJ", "Kalam", "Keral");
				//new UserDetails("Anil", "Kakodakar", "Pune")
	}
	
	
}
