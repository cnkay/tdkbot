package com.example.demo;

import com.example.demo.Safe.NullSafe;
import com.example.demo.Safe.NullSafeImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public NullSafe nullSafe() {
		return new NullSafeImp();
	}
}
