package com.abrechnung.artikelvsnumber;

public class KellnerCSV {
	private Integer GDID; 
	private String artikelName;
	
	public KellnerCSV(Integer GDID, String artikelName) {
		this.GDID = GDID;
		this.artikelName = artikelName;
	}

	public Integer getGDID() {
		return GDID;
	}

	public void setGDID(Integer gDID) {
		GDID = gDID;
	}

	public String getArtikelName() {
		return artikelName;
	}

	public void setArtikelName(String artikelName) {
		this.artikelName = artikelName;
	}	
}
