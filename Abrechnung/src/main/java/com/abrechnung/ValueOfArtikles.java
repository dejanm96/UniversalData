package com.abrechnung;

public class ValueOfArtikles {

	private String GDID;
	private Integer bottle;
	private Double doseValue;
	
	public ValueOfArtikles() {  }
	
	public ValueOfArtikles(String Name, Integer bottle, Double doseValue) {
		this.GDID = Name;
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


	@Override
	public String toString() {
		return  GDID + ", bottle=" + bottle + ", doseValue=" + doseValue;
	}




	
	
}
