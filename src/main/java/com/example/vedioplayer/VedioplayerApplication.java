	package com.example.vedioplayer;
	
	import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
	
	@SpringBootApplication
	@ComponentScan(basePackages = {
		    "com.example.vedioplayer",
		    "controller",           // If your controller is in package "controller"
		    "service",              // If your service is in package "service" 
		    "model"                 // If your model is in package "model"
		})
	public class VedioplayerApplication {
	
		public static void main(String[] args) {
			SpringApplication.run(VedioplayerApplication.class, args);
		}
	
	}
