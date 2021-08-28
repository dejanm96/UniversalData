package com.abrechnung.artikelvsnumber;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class ArtikelIDListe {	
	
	public ArtikelIDListe() {
		
	}
	
	public List<KellnerCSV> getArtikelList() throws IOException {		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\micic\\OneDrive\\Desktop\\Abrechnung\\UniversalData\\CSV\\kellner.csv");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		
		List<KellnerCSV> list = new ArrayList<>();
		
		String line = "";
		int lines = 0;
		
		while((line=bufferedReader.readLine())!=null) {
			lines++;
			String[] columns = line.split(";");
			if (lines == 1) {
				continue;
			} else {

				list.add(new KellnerCSV(Integer.parseInt(columns[7]) , columns[3]));
				
			}
		}
		bufferedReader.close();
		return list;
	}
}
