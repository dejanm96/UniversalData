package com.abrechnung.users;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

import com.abrechnung.ReadFullCSV;
import com.abrechnung.ValueOfArtikles;
import com.abrechnung.db.Users;

public class AdminReadCSV {

	private Users singleObject = Users.singleObject();
	private Integer userNumber = 0;
	private ReadFullCSV readCSV = new ReadFullCSV();
	
	
	public AdminReadCSV(Integer userNumber) {
		this.setUserNumber(userNumber);
	}
	
	public AdminReadCSV() { }

	public void addListToUser(String file) throws NumberFormatException, IOException, ParseException {
		if(!singleObject.checkMapForUser(userNumber))
			singleObject.addToMap(userNumber, readCSV.readCSVFile(file));
	}
	
	
	public HashMap<Integer, List<ValueOfArtikles>> getMap() {
		HashMap<Integer, List<ValueOfArtikles>> mapToReturn  = singleObject.getMapOfUserNoAndList();
		return mapToReturn;
	}
	
	public void clearCSVLists() {
		singleObject.clearMap();
	}
	
	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}
	
	
}
