package guru.springframework.chucknorris;

import guru.springframework.chucknorris.controllers.JokeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChucknorrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChucknorrisApplication.class, args);
	}

}
