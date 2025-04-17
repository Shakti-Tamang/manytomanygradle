package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



// The OPTIONS HTTP method requests permitted communication options for a given URL or server. 
// This can be used to test the allowed HTTP methods for a request, or to determine whether a
//  request would succeed when making a CORS preflighted request. A client can specify a URL 
//  with this method, or an asterisk (*) to refer to the entire server.
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
