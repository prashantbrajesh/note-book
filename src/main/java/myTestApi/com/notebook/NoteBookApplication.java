package myTestApi.com.notebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NoteBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteBookApplication.class, args);
	}
}
