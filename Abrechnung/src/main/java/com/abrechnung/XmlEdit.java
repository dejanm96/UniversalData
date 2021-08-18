package com.abrechnung;

public class XmlEdit {

	private Integer GDID;
	private String raum;
	private Integer mengeKisten;
	private Integer mengeFlaschen;
	private Double mengeEinheit;

	public XmlEdit() {
		
	}
	
	public Integer getGDID() {
		return GDID;
	}

	public void setGDID(Integer gDID) {
		GDID = gDID;
	}

	public String getRaum() {
		return raum;
	}

	public void setRaum(String raum) {
		this.raum = raum;
	}

	public Integer getMengeFlaschen() {
		return mengeFlaschen;
	}

	public void setMengeFlaschen(Integer mengeFlaschen) {
		this.mengeFlaschen = mengeFlaschen;
	}

	public Double getMengeEinheit() {
		return mengeEinheit;
	}

	public void setMengeEinheit(Double mengeEinheit) {
		this.mengeEinheit = mengeEinheit;
	}

	public Integer getMengeKisten() {
		return mengeKisten;
	}

	public void setMengeKisten(Integer mengeKisten) {
		this.mengeKisten = mengeKisten;
	}

	@Override
	public String toString() {
		return "XmlEdit [GDID=" + GDID + ", raum=" + raum + ", mengeKisten=" + mengeKisten + ", mengeFlaschen="
				+ mengeFlaschen + ", mengeEinheit=" + mengeEinheit + "]";
	}


}
