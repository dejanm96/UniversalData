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
	
	public boolean buffetHasSweets(Integer buffetNo) {
		boolean found = false;
		for(Map.Entry<Sweets, Integer> entry : map.entrySet())
			if(entry.getValue().equals(buffetNo))	
				found = true;
		return found;
	}

	public void clearSweetsDB() {
		System.out.println("DB CLEARED!");
		map.clear();
	}

	public void updateSweetsForBuffet(Sweets sweets, Integer number) {
		Sweets sweet = null;
		for(Map.Entry<Sweets, Integer> entry : map.entrySet()) {
			if(entry.getValue().equals(number)) {
				sweet = entry.getKey();
			}
		}
		sweet.setOper(sweets.getOper() + sweet.getOper());
		sweet.setSacher(sweets.getSacher() + sweet.getSacher());
		sweet.setGerstner(sweets.getGerstner() + sweet.getGerstner());
		sweet.setPunchkrapfen(sweets.getPunchkrapfen() + sweet.getPunchkrapfen());
		sweet.setPspitz(sweets.getPspitz() + sweet.getPspitz());
		sweet.setOrange(sweets.getOrange() + sweet.getOrange());
		sweet.setPistazie(sweets.getPistazie() + sweet.getPistazie());
		sweet.setNuss(sweets.getNuss() + sweet.getNuss());
		sweet.setKaffee(sweets.getKaffee() + sweet.getKaffee());
		sweet.setMandelH(sweets.getMandelH() + sweet.getMandelH());
		sweet.setMandelD(sweets.getMandelD() + sweet.getMandelD());
		sweet.setSchach(sweets.getSchach() + sweet.getSchach());
		sweet.setnougat(sweets.getnougat() + sweet.getnougat());
		sweet.setKongo(sweets.getKongo() + sweet.getKongo());
		sweet.setMandelschnitte(sweets.getMandelschnitte() + sweet.getMandelschnitte());
		sweet.setKafekonf(sweets.getKafekonf() + sweet.getKafekonf());
		sweet.setMozart(sweets.getMozart() + sweet.getMozart());
		sweet.setNusskonf(sweets.getNusskonf() + sweet.getNusskonf());
		sweet.setNusshauf(sweets.getNusshauf() + sweet.getNusshauf());
		sweet.setTiramisu(sweets.getTiramisu() + sweet.getTiramisu());
		sweet.setEclair(sweets.getEclair() + sweet.getEclair());
		sweet.setSachertorte(sweets.getSachertorte() + sweet.getSachertorte());
		sweet.setEster(sweets.getEster() + sweet.getEster());
		sweet.setPfdiverse(sweets.getPfdiverse() + sweet.getPfdiverse());
		sweet.setKonfdiverse(sweets.getKonfdiverse() + sweet.getKonfdiverse());
		sweet.setMacroons(sweets.getMacroons() + sweet.getMacroons());
		sweet.setErdbeere(sweets.getErdbeere() + sweet.getErdbeere());
		sweet.setMaroniD(sweets.getMaroniD() + sweet.getMaroniD());
		sweet.setMaroniH(sweets.getMaroniH() + sweet.getMaroniH());
	
	
	}
	public void clearDbForOneBuffet(Integer number) {
		for(Map.Entry<Sweets, Integer> entry : map.entrySet()) {
			if(entry.getValue().equals(number)) 
				map.remove(entry.getKey());
		}
	}
}
