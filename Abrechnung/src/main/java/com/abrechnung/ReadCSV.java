package com.abrechnung;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.abrechnung.artikelvsnumber.ArtikelIDListe;
import com.abrechnung.artikelvsnumber.KellnerCSV;

public class ReadCSV {

	public ReadCSV() {
		// TODO Auto-generated constructor stub
	}
	
	public List<ValueOfArtikles> runThis() throws NumberFormatException, IOException, ParseException {
		List<ValueOfArtikles> anfang = new ArrayList<>();
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dejan\\Desktop\\CSV\\inventur.csv");
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		
		String line = "";
		int lines = 0;
	//	int cnt = 0;
		while((line=bufferedReader.readLine())!=null) {
		//	cnt++;
			lines++;
			String[] columns = line.split(";");
			if (lines == 1) {
				continue;
			} else {
				XmlEdit column = new XmlEdit();
				
				Integer GDID = Integer.parseInt(columns[0]);
				Integer bottles = Integer.parseInt(columns[3]);
				
				NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
				Number number = format.parse((columns[4]));
				Double doseValue = number.doubleValue();
				
				anfang.add(new ValueOfArtikles(getStringName(GDID), bottles, doseValue));
				
				column.setGDID(GDID);
				column.setRaum(columns[1]);
				column.setMengeKisten(Integer.parseInt(columns[2]));
				column.setMengeFlaschen(bottles);
				column.setMengeEinheit(doseValue);

			}
		}
//		System.out.println(anfang.size() + "########################");
//		for(ValueOfArtikles eachValue : anfang)
//			System.out.println(eachValue);
//		
		return anfang;
		}

	private String getStringName(Integer GDID) throws IOException {
		ArtikelIDListe list = new ArtikelIDListe();
		List<KellnerCSV> liste = list.getArtikelList();
		String returnString = " "; 
		
		for(KellnerCSV each : liste)
			if(each.getGDID().equals(GDID))
				returnString = each.getArtikelName();

		return returnString;
	}
	}

