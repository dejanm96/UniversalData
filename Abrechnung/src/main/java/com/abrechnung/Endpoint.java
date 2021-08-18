package com.abrechnung;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

	@RequestMapping(value = "/anfang", method = RequestMethod.GET, produces = "application/json")
	public List<ValueOfArtikles> anfangstand() throws NumberFormatException, IOException, ParseException {
		ReadCSV readCSV = new ReadCSV();
		
		
		return readCSV.runThis();
		
		
	}
	
	
	@RequestMapping(value = "/sendMail/", method = RequestMethod.GET, produces = "application/json")
	public void mailSenden() {

		SendMail send = new SendMail();
		
		send.sendMailNow();
	}
	
	
}
