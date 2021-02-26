package day1.loesungen.exceptions2;

import day1.loesungen.exceptions1.Person;

import java.util.List;

public class Utility {
	public static Person filter(List<Person> personen, String nachname) throws Exception {
		for(Person p: personen) {
			if(p.getNachname().equals(nachname)) {
				return p;
			}
		}	
		throw new Exception("Es wurde keine Person mit dem Namen " + nachname + " gefunden");
	}
}
