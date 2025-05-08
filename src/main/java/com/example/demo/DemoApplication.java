package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;







// Schema: The schema is the core of GraphQL, an essential blueprint that shapes your API’s 
// structure, 
// defines its data types, and showcases its impressive capabilities. It acts as a friendly agreement 
// between the client and server, laying out which data can be requested and what will be provided in
//  return.

// Imagine the schema as a detailed roadmap that guides developers and clients through the API 
// landscape. It clarifies what data can be accessed and how to make it a breeze to interact with 
// the API efficiently.


// The OPTIONS HTTP method requests permitted communication options for a given URL or server. 
// This can be used to test the allowed HTTP methods for a request, or to determine whether a
//  request would succeed when making a CORS preflighted request. A client can specify a URL 
//  with this method, or an asterisk (*) to refer to the entire server.

// for example  if the same endpoint accessed by the Desktop app and Mobile 
// But if desktop app want different response it send query to server and through graphql get final output


// there are three main phases descibe data 

// set query 

// get predectable result

// ./gradlew clean build
// gradlew clean build
// gradle build --refresh-dependencies

// ./gradlew clean build publishToMavenLocal

// ./gradlew bootRun

// ./gradlew dependencies
@SpringBootApplication
@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {

SpringApplication.run(DemoApplication.class, args);
	}

}
