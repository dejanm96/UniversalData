package com.abrechnung.models;



import org.json.JSONArray;
import org.json.JSONObject;


public class Sweets {
	private Integer oper = 0, sacher = 0, gerstner = 0, punchkrapfen = 0, pspitz = 0, orange = 0, pistazie = 0, kaffee = 0, nuss = 0;
	private Integer mandelH = 0, mandelD = 0, schach = 0, nougat = 0, kongo = 0, kafekonf = 0, mandelschnitte = 0, mozart = 0, nusskonf = 0, nusshauf = 0;
	private Integer tiramisu = 0, eclair = 0, sachertorte = 0, ester = 0;
	private Integer pfdiverse = 0, konfdiverse = 0;		
	private Integer macroons = 0;
	
	public Sweets() {
		
	}
			
	public Integer getOper() {
		return oper;
	}
	public void setOper(Integer oper) {
		this.oper = checkIfNull(oper);
	}
	public Integer getSacher() {
		return sacher;
	}
	public void setSacher(Integer sacher) {
		this.sacher = checkIfNull(sacher);
	}
	public Integer getGerstner() {
		return gerstner;
	}
	public void setGerstner(Integer gerstner) {
		this.gerstner = checkIfNull(gerstner);
	}
	public Integer getPspitz() {
		return pspitz;
	}
	public void setPspitz(Integer pspitz) {
		this.pspitz = checkIfNull(pspitz);
	}
	public Integer getOrange() {
		return orange;
	}
	public void setOrange(Integer orange) {
		this.orange = checkIfNull(orange);
	}
	public Integer getPistazie() {
		return pistazie;
	}
	public void setPistazie(Integer pistazie) {
		this.pistazie = checkIfNull(pistazie);
	}
	public Integer getKaffee() {
		return kaffee;
	}
	public void setKaffee(Integer kaffee) {
		this.kaffee = checkIfNull(kaffee);
	}
	public Integer getNuss() {
		return nuss;
	}
	public void setNuss(Integer nuss) {
		this.nuss = checkIfNull(nuss);
	}
	public Integer getMandelH() {
		return mandelH;
	}
	public void setMandelH(Integer mandelH) {
		this.mandelH = checkIfNull(mandelH);
	}
	public Integer getMandelD() {
		return mandelD;
	}
	public void setMandelD(Integer mandelD) {
		this.mandelD = checkIfNull(mandelD);
	}
	public Integer getnougat() {
		return nougat;
	}
	public void setnougat(Integer nougat) {
		this.nougat = checkIfNull(nougat);
	}
	public Integer getKongo() {
		return kongo;
	}
	public void setKongo(Integer kongo) {
		this.kongo = checkIfNull(kongo);
	}
	public Integer getMozart() {
		return mozart;
	}
	public void setMozart(Integer mozart) {
		this.mozart = checkIfNull(mozart);
	}
	public Integer getNusskonf() {
		return nusskonf;
	}
	public void setNusskonf(Integer nusskonf) {
		this.nusskonf = checkIfNull(nusskonf);
	}
	public Integer getTiramisu() {
		return tiramisu;
	}
	public void setTiramisu(Integer tiramisu) {
		this.tiramisu = checkIfNull(tiramisu);
	}
	public Integer getEclair() {
		return eclair;
	}
	public void setEclair(Integer eclair) {
		this.eclair = checkIfNull(eclair);
	}
	public Integer getSachertorte() {
		return sachertorte;
	}
	public void setSachertorte(Integer sachertorte) {
		this.sachertorte = checkIfNull(sachertorte);
	}

	public Integer getPunchkrapfen() {
		return punchkrapfen;
	}

	public void setPunchkrapfen(Integer punchkrapfen) {
		this.punchkrapfen = checkIfNull(punchkrapfen);
	}

	public Integer getSchach() {
		return schach;
	}

	public void setSchach(Integer schach) {
		this.schach = checkIfNull(schach);
	}

	public Integer getMandelschnitte() {
		return mandelschnitte;
	}

	public void setMandelschnitte(Integer mandelschnitte) {
		this.mandelschnitte = checkIfNull(mandelschnitte);
	}

	public Integer getNusshauf() {
		return nusshauf;
	}

	public void setNusshauf(Integer nusshauf) {
		this.nusshauf = checkIfNull(nusshauf);
	}

	public Integer getEster() {
		return ester;
	}

	public void setEster(Integer ester) {
		this.ester = checkIfNull(ester);
	}

	public Integer getKafekonf() {
		return kafekonf;
	}

	public void setKafekonf(Integer kafekonf) {
		this.kafekonf = checkIfNull(kafekonf);
	}
	
	public Integer getKonfdiverse() {
		return konfdiverse;
	}

	public void setKonfdiverse(Integer konfdiverse) {
		this.konfdiverse = checkIfNull(konfdiverse);
	}

	public Integer getPfdiverse() {
		return pfdiverse;
	}

	public void setPfdiverse(Integer pfdiverse) {
		this.pfdiverse = checkIfNull(pfdiverse);
	}

	public Integer getMacroons() {
		return macroons;
	}

	public void setMacroons(Integer macroons) {
		this.macroons = checkIfNull(macroons);
	}
	
	
	private Integer checkIfNull(Integer value) {
		if(value == null)
			value = 0;
		return value;
	}

	
	public String getArray(Integer number) {
		JSONArray array = new JSONArray();
	
		if(getOper() > 0)  array.put(addJsonObject("PF Oper", getOper()));
		

		if(getSacher() > 0) array.put(addJsonObject("PF Sacher", getSacher()));
		

		if(getGerstner() > 0) array.put(addJsonObject("PF Gerstner", getGerstner()));
		

		if(getPunchkrapfen() > 0) array.put(addJsonObject("PF Punchkrapfen", getPunchkrapfen()));
		

		if(getPspitz() > 0) array.put(addJsonObject("PF Pariser Spitz", getPspitz()));
		

		if(getOrange() > 0) array.put(addJsonObject("PF Orange", getOrange()));
		

		if(getPistazie() > 0) array.put(addJsonObject("PF Pistazie", getPistazie()));
		

		if(getNuss() > 0) array.put(addJsonObject("PF Nuss", getNuss()));
		

		if(getKaffee() > 0) array.put(addJsonObject("PF Kaffee", getKaffee()));
		

		if(getMandelH() > 0) array.put(addJsonObject("Mandelsplitter Hell", getMandelH()));
		

		if(getMandelD() > 0) array.put(addJsonObject("Mandelsplitter Dunkel", getMandelD()));
		

		if(getSchach() > 0) array.put(addJsonObject("Nougatwuerfell", getSchach()));
		
		
		if(getnougat() > 0) array.put(addJsonObject("Nougat dressing", getnougat()));
		

		if(getKongo() > 0) array.put(addJsonObject("Kongo", getKongo()));
		

		if(getMandelschnitte() > 0) array.put(addJsonObject("Mandelschnitte", getMandelschnitte()));
		

		if(getKafekonf() > 0) array.put(addJsonObject("Kaffeekonfekt", getKafekonf()));
		

		if(getMozart() > 0) array.put(addJsonObject("Mozartkugel", getMozart()));
		
		
		if(getNusskonf() > 0) array.put(addJsonObject("Nusskonfekt", getNusskonf()));
		

		if(getNusshauf() > 0) array.put(addJsonObject("Nusshaeufchen", getNusshauf()));
		

		if(getTiramisu() > 0) array.put(addJsonObject("Tiramisu", getTiramisu()));
		

		if(getEclair() > 0) array.put(addJsonObject("Eclair", getEclair()));


		if(getSachertorte() > 0) array.put(addJsonObject("Sachertorte", getSachertorte()));
		

		if(getEster() > 0) array.put(addJsonObject("Esterhazy", getEster()));
		
		
		if(getPfdiverse() > 0) array.put(addJsonObject("PF diverse", getPfdiverse()));
		
		
		if(getKonfdiverse() > 0) array.put(addJsonObject("Konfekt diverse", getKonfdiverse()));

		
		if(getMacroons() > 0) array.put(addJsonObject("Makronen", getMacroons()));
		
		return array.toString();
	}

	private JSONObject addJsonObject(String name, Integer value) {
		JSONObject obj = new JSONObject();

		obj.put("Name", name);
		obj.put("Value", value);

		return obj;
	}



}
