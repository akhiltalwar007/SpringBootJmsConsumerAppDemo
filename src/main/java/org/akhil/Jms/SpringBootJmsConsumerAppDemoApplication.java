package org.akhil.Jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBootJmsConsumerAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmsConsumerAppDemoApplication.class, args);
	}

}
