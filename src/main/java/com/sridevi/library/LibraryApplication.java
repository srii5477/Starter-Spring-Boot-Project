package com.sridevi.library;

import com.sridevi.library.controller.LibraryController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sridevi.library.model")
public class LibraryApplication {
    private LibraryController ctrler;
	public LibraryApplication(LibraryController ctrler) {
		this.ctrler = ctrler;
	}
	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
