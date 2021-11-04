package com.abrechnung;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.abrechnung.artikelvsnumber.ArtikelIDListe;
import com.abrechnung.artikelvsnumber.KellnerCSV;

public class ReadFullCSV {

	public ReadFullCSV() {
		// TODO Auto-generated constructor stub
	}

	public List<ValueOfArtikles> readCSVFile(String file) throws NumberFormatException, IOException, ParseException {
		List<ValueOfArtikles> anfang = new ArrayList<>();

		FileInputStream fileInputStream = new FileInputStream(
				"/root/CSV/" + file);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		
		String line = "";
		int lines = 0;

		while ((line = bufferedReader.readLine()) != null) {

			lines++;
			String[] columns = line.split(";");
			if (lines == 1) {
				continue;
			} else {

				Integer GDID = Integer.parseInt(columns[0]);
				Integer bottles = Integer.parseInt(columns[3]);

				DecimalFormatSymbols symbols = new DecimalFormatSymbols();
				symbols.setDecimalSeparator(',');
				DecimalFormat format = new DecimalFormat("0.#");
				format.setDecimalFormatSymbols(symbols);
				Double value = format.parse(columns[4]).doubleValue();

				String room = columns[1];
				anfang.add(new ValueOfArtikles(room, getStringName(GDID), bottles, value));

				anfang.stream().sorted((object1, object2) -> object1.getRoom().compareTo(object2.getRoom()));

			}
		}
		bufferedReader.close();
		return anfang;
	}

	private String getStringName(Integer GDID) throws IOException {
		ArtikelIDListe list = new ArtikelIDListe();

		List<KellnerCSV> liste = list.getArtikelList();
		String returnString = " ";

		for (KellnerCSV each : liste)
			if (each.getGDID().equals(GDID))
				returnString = each.getArtikelName();

		return returnString;
	}
}
