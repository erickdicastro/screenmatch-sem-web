package br.com.erick.screenmatch;

import br.com.erick.screenmatch.principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);

		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
