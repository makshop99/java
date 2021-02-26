package day1.loesungen.exceptions1;

public class AlreadyMarriedException extends Exception {
	private String whosAlreadyMarried;

	public AlreadyMarriedException(String whosAlreadyMarried) {
		super("Folgende Personen sind bereits verheiratet: " + whosAlreadyMarried);
		this.whosAlreadyMarried = whosAlreadyMarried;
	}

	public String getWhosAlreadyMarried() {
		return whosAlreadyMarried;
	}

	public void setWhosAlreadyMarried(String whosAlreadyMarried) {
		this.whosAlreadyMarried = whosAlreadyMarried;
	}
	
	

}
