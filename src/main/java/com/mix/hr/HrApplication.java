package com.mix.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.data.jpa.repository.config.EnableJpaAuditing
public class HrApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

}
