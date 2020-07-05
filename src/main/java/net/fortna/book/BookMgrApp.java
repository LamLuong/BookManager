package net.fortna.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"net.fortna.book.dao"})
public class BookMgrApp extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BookMgrApp.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BookMgrApp.class, args);
	}

}
