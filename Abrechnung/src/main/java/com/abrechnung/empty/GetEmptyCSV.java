package com.abrechnung.empty;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.abrechnung.ValueOfArtikles;
import com.abrechnung.XmlEdit;

public class GetEmptyCSV {
	
	public void loadEmptyCSV() {
		List<ValueOfArtikles> anfang = new ArrayList<>();
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dejan\\Desktop\\CSV\\inventur.csv");
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		
		String line = "";
		int lines = 0;
	
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
				
				
				column.setGDID(GDID);
				column.setRaum(columns[1]);
				column.setMengeKisten(Integer.parseInt(columns[2]));
				column.setMengeFlaschen(bottles);
				column.setMengeEinheit(doseValue);
	
			}
		}
	}
}
