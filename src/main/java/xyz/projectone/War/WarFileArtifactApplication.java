package xyz.projectone.War;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages ="xyz.projectone.War,"
	       + "xyz.projectone.War.service")
public class WarFileArtifactApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarFileArtifactApplication.class, args);
	}

}
