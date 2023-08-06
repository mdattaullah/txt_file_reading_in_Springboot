package in.attaullah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.attaullah.service.BookService;

@SpringBootApplication
public class BooksAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(BooksAppApplication.class, args);

		BookService bookService = context.getBean(BookService.class);

		bookService.processBooks();
	}
}
