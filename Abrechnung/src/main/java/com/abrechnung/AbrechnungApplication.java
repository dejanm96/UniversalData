package com.abrechnung;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbrechnungApplication {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		SpringApplication.run(AbrechnungApplication.class, args);
	
	}

}
