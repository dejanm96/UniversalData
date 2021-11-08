package com.abrechnung;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.abrechnung.db.SweetsDB;
import com.abrechnung.db.Users;
import com.abrechnung.models.Sweets;
import com.abrechnung.users.AdminReadCSV;

@RestController
public class Endpoint {
	private SweetsDB db = SweetsDB.singleObject();
	
	@CrossOrigin
	@RequestMapping(value = "/anfang/{number}", method = RequestMethod.GET, produces = "application/json")
	public String anfangstand(@PathVariable Integer number) throws NumberFormatException, IOException, ParseException {
		
		List<ValueOfArtikles> list = Users.getSingleObject().getObjectWithID(number);
		
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
	
	
	
	
	@RequestMapping(value = "/admin/{action}", method = RequestMethod.GET)
	public String adminAction(@PathVariable String action) throws NumberFormatException, IOException, ParseException {
		AdminReadCSV admin = null;
		String stringToReturn = "";
		switch (action) {
		case "readCSV":
			admin = new AdminReadCSV(99);
			admin.addListToUser("inventur.csv");
			admin = new AdminReadCSV(4);
			admin.addListToUser("inventur1.csv");
			stringToReturn = "Succesfully added inventur liste!";
			break;
			
		case "deleteCSV":
			admin = new AdminReadCSV();
			admin.clearCSVLists();
			stringToReturn = "Succesfully cleared inventur liste";
			break;		
			
		case "clearSweetsDB":
			db.clearSweetsDB();
			stringToReturn = "Succesfully cleared sweets list";
			break;
			
		default:
			stringToReturn = "WRONG ADMIN ACTION!";
			break;
		}
		
		return stringToReturn;
	}
	
	@RequestMapping("/admin")
	public ModelAndView admin() {
	    ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin.html");
	    return modelAndView;
	}
	
	
	@RequestMapping("/adminSweetsFrontend")
	public ModelAndView adminSweets() {
	    ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("sweetsAdmin.html");
	    return modelAndView;
	}
	
	@RequestMapping(value = "/list/{number}",  method = RequestMethod.GET, produces = "application/json")
	public ModelAndView getList(@PathVariable Integer number) throws NumberFormatException, IOException, ParseException {
	    ModelAndView modelAndView = new ModelAndView();
	    switch (number) {
		case 4:
		    modelAndView.setViewName("welcome4.html");
			break;
		case 99:
		    modelAndView.setViewName("welcome99.html");
			break;
		case 13:
		    modelAndView.setViewName("welcome13.html");
			break;
		case 5:
		    modelAndView.setViewName("welcome5.html");
			break;
		case 97:
		    modelAndView.setViewName("welcome97.html");
			break;
		case 2:
		    modelAndView.setViewName("welcome2.html");
			break;
		case 6:
		    modelAndView.setViewName("welcome6.html");
			break;
		case 11:
		    modelAndView.setViewName("welcome11.html");
			break;
		case 12:
		    modelAndView.setViewName("welcome12.html");
			break;
		default:
			break;
		}

	    return modelAndView;
	}
			
	@RequestMapping("/anfangstand/{number}")
	public ModelAndView index (@PathVariable Integer number) {
	    ModelAndView modelAndView = new ModelAndView();
		switch (number) {
		case 4:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 13:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 5:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 97:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 2:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 12:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 11:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 6:
			modelAndView.setViewName("notDoneYet.html");
			break;	
		case 99:
			modelAndView.setViewName("anfang99.html");
			break;
		default:
			break;
		}
	    return modelAndView;
	}
	
	
	@RequestMapping("/endstand/{number}")
	public ModelAndView endstand(@PathVariable Integer number) {
	    ModelAndView modelAndView = new ModelAndView();
		switch (number) {
		case 4:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 13:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 5:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 97:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 2:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 12:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 11:
			modelAndView.setViewName("notDoneYet.html");
			break;
		case 6:
			modelAndView.setViewName("notDoneYet.html");
			break;	
		case 99:
			modelAndView.setViewName("notDoneYet.html");
			break;
		default:
			break;
		}
	    return modelAndView;
	}
	
	
	@RequestMapping("/kassa")
	public ModelAndView kassa() {
	    ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("kassa.html");
	    return modelAndView;
	}

	@CrossOrigin
	@RequestMapping("/sweets/{number}")
	public ModelAndView sweets(@PathVariable Integer number) {
	    ModelAndView modelAndView = new ModelAndView();
	    if(number == 4)
	    	modelAndView.setViewName("sweets4.html");
	    if(number == 13)
	    	modelAndView.setViewName("sweets13.html");
	    if(number == 5)
	    	modelAndView.setViewName("sweets5.html");
	    if(number == 97)
	    	modelAndView.setViewName("sweets97.html");
	    if(number == 2)
	    	modelAndView.setViewName("sweets2.html");
	    if(number == 6)
	    	modelAndView.setViewName("sweets6.html");
	    if(number == 12)
	    	modelAndView.setViewName("sweets12.html");
	    if(number == 11)
	    	modelAndView.setViewName("sweets11.html");
	    if(number == 99)
	    	modelAndView.setViewName("sweets99.html");
	    return modelAndView;
	}

	//Add sweets
	@CrossOrigin
	@PostMapping(value = "/addSweets/{number}", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public void createProduct(@RequestBody Sweets sweets, @PathVariable Integer number) {
		db.addSweetsToBuffet(number, sweets);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getSweets/{number}", method = RequestMethod.GET)
	@ResponseBody
	public String getSweetsForBuffet(@PathVariable Integer number) {
		Sweets sweets = db.getSweetsForBuffet(number);
		if(sweets == null)
			sweets = new Sweets();
		return sweets.getArray(number);
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
