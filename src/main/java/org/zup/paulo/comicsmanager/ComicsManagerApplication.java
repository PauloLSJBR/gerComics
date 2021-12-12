package org.zup.paulo.comicsmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ComicsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComicsManagerApplication.class, args);
	}

}
