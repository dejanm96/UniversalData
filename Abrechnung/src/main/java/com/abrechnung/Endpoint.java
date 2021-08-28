package com.abrechnung;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class Endpoint {
	@CrossOrigin
	@RequestMapping(value = "/anfang", method = RequestMethod.GET, produces = "application/json")
	public String anfangstand() throws NumberFormatException, IOException, ParseException {
		ReadFullCSV readCSV = new ReadFullCSV();
		
		List<ValueOfArtikles> list = readCSV.readCSVFile();
		
		JSONArray object = new JSONArray();
		
		for(ValueOfArtikles each : list) {
			JSONObject obj = new JSONObject();
			obj.put("BZ", each.getRoom());
			obj.put("Artikel", each.getGDID());
			obj.put("Flasche", each.getBottle());
			obj.put("Einheit", each.getDoseValue());
			
			object.put(obj); 
		}
			
		
		return object.toString();
		
		
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hey";
	}
	
	@RequestMapping("/")
	public ModelAndView index () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("frontend.html");
	    return modelAndView;
	}
	
	
	@RequestMapping("/endstand")
	public ModelAndView endstand() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("endstand.html");
	    return modelAndView;
	}


	@RequestMapping(value = "/sendMail", method = RequestMethod.GET)
	public String mailSenden() {

		String returnString = "";
		
		SendMail send = new SendMail();
		
		boolean sent = send.sendMailNow();
		
		if(sent)
			returnString = "Sucessfully sent!";
		else
			returnString = "Sending mail failure!";
		
		return returnString;		
		
	}
	
	
	
	
}
