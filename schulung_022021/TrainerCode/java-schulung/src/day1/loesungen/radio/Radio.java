package day1.loesungen.radio;

public class Radio {

    boolean isOn;
    int volume;

    void changeVolume(int value) {
        volume = Math.min(Math.max(volume + value, 0), 100);
    }

    void volumeUp() {
        changeVolume(1);
    }

    void volumeDown() {
        changeVolume(-1);
    }

    void on() {
        isOn = true;
    }

    void off() {
        isOn = false;
    }

    boolean isOn() {
        return isOn;
    }

    public String toString() {
        return "Radio[volume=" + volume + ", is " + (isOn ? "on" : "off") + "]";
    }

    public static double stationNameToFrequency(String station) {
        if (station == null)
            return 0.0;
        switch (station) {
            case "walking the plank":
                return 98.3;
            case "radio123":
                return 102.3;
            default:
                return 0.0;
        }
    }
}
