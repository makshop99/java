package day1.loesungen.exceptions1;

public class Person {
	private String vorname;
	private String nachname;
	private boolean isMarried;
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public Person(String vorname, String nachname, boolean isMarried) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.isMarried = isMarried;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	public void marry(Person personToMarry) throws AlreadyMarriedException {
		if(this.isMarried() && personToMarry.isMarried() ) {
			throw new AlreadyMarriedException(this.getVorname() + " & " + personToMarry.getVorname());
		} else if (personToMarry.isMarried()) {
			throw new AlreadyMarriedException(personToMarry.getVorname());
		} else if(this.isMarried()) {
			throw new AlreadyMarriedException(this.getVorname());
		} else {
			this.setMarried(true);
			personToMarry.setMarried(true);
		}
	}
	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", isMarried=" + isMarried + "]";
	}
	
	
	
	
}
