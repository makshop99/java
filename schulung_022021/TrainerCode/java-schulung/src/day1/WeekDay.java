package day1;

public enum WeekDay {
    MONTAG("monday"),
    DIENSTAG("tuesday"),
    MITTWOCH;

    private String translation;

    WeekDay(String translation) {
        this.translation = translation;
    }

    WeekDay() {

    }

    public String getTranslation() {
        return translation;
    }

    public static void listAllValues() {
        for(WeekDay w: values()) {
            System.out.println(w);
        }
    }
}
