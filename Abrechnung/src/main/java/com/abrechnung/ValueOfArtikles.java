package com.abrechnung;

public class ValueOfArtikles {

	private String room;
	private String GDID;
	private Integer bottle;
	private Double doseValue;
	
	public ValueOfArtikles() {  }
	
	public ValueOfArtikles(String room, String name, Integer bottle, Double doseValue) {
		this.room = room;
		this.GDID = name;
		this.bottle = bottle;
		this.doseValue = doseValue;
	}

	public Integer getBottle() {
		return bottle;
	}

	public void setBottle(Integer bottle) {
		this.bottle = bottle;
	}

	public Double getDoseValue() {
		return doseValue;
	}

	public void setDoseValue(Double doseValue) {
		this.doseValue = doseValue;
	}

	
	
	public String getGDID() {
		return GDID;
	}

	public void setGDID(String gDID) {
		GDID = gDID;
	}


	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return  room + "- Artikel: " + GDID + " Flashen: " + bottle + " Einheiten: " + doseValue ;
	}


}
