package com.consul.democonsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
/** panggil configuration MyConfiguration **/
@EnableConfigurationProperties({
		MyConfiguration.class
})
public class DemoConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConsulApplication.class, args);
	}
}
