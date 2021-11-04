package com.abrechnung.db;

import java.util.HashMap;
import java.util.Map;

import com.abrechnung.models.Sweets;

public class SweetsDB {
	private static SweetsDB singleObject = null; 
	Map<Sweets, Integer> map = new HashMap<>();
	
	 private SweetsDB() {    }
         
	 public static SweetsDB singleObject() {
			
			if(singleObject == null) {
				singleObject = new SweetsDB();
			}
			return singleObject;
		}

	public static SweetsDB getSingleObject() {
		return singleObject;
	}
	
	public void addSweetsToBuffet(Integer buffetNo, Sweets sweets) {
		map.put(sweets, buffetNo);
	}
	
	public Sweets getSweetsForBuffet(Integer buffetNo) {
		Sweets sweetsToReturn = null;
		for(Map.Entry<Sweets, Integer> entry : map.entrySet())
			if(entry.getValue().equals(buffetNo))	
				sweetsToReturn = entry.getKey();
		return sweetsToReturn;
	}

	public void clearSweetsDB() {
		System.out.println("DB CLEARED!");
		map.clear();
	}
	
}
