package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * Spring Boot ist dafür da Spring Projekte anzulegen ohne den ganzen Konfigruation aufwand.
 * Es existieren Standartkonfigurationen, die jederzeit überschrieben werden können
 * spring-boot-starter-parent, ist das erste und einziges parent was verwendet wird
 */
@SpringBootApplication
public class LibraryApplication {
/*
 * Es existiert schon ein integrierten Tomcat, der aber noch umkonfiguriert werden kann
 */
	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
