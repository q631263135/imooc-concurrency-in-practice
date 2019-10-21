package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImoocConcurrencyInPracticeApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ImoocConcurrencyInPracticeApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
