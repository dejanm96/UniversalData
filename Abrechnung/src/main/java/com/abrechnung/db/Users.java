package com.abrechnung.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.abrechnung.ValueOfArtikles;

public class Users {
	
	private static Users singleObject = null; 
	private HashMap<Integer, List<ValueOfArtikles>> mapOfUserNoAndList = new HashMap<>();
	
	 private Users() {    }
         
	 public static Users singleObject() {
			
			if(singleObject == null) {
				singleObject = new Users();
			}
			return singleObject;
		}

	public static Users getSingleObject() {
		return singleObject;
	}
	
	public boolean checkMapForUser(Integer noToCheck) {
		boolean found = false;
		mapOfUserNoAndList.containsKey(noToCheck);
		return found;
	}

	public static void setSingleObject(Users singleObject) {
		Users.singleObject = singleObject;
	}

	public HashMap<Integer, List<ValueOfArtikles>> getMapOfUserNoAndList() {
		return mapOfUserNoAndList;
	}

	public void addToMap(Integer number, List<ValueOfArtikles> list) {
		this.mapOfUserNoAndList.put(number, list);
	}

	public void clearMap() {
		mapOfUserNoAndList.clear();
	}

	public List<ValueOfArtikles> getObjectWithID(Integer number) {
		List<ValueOfArtikles> listToReturn = new ArrayList<>();
		
		for (Entry<Integer, List<ValueOfArtikles>> entry : mapOfUserNoAndList.entrySet()) {
		   if(entry.getKey().equals(number))
		    listToReturn = entry.getValue();
		}
		return listToReturn;
	}
     


}
