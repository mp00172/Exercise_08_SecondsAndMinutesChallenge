public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(3, 14));
        System.out.println(getDurationString(-3, 14));
        System.out.println(getDurationString(3, -14));
        System.out.println(getDurationString(123, 14));
        System.out.println(getDurationString(1334));
        System.out.println(getDurationString(31334));
        System.out.println(getDurationString(3601));
        System.out.println(getDurationString(-3601));
    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        minutes = minutes % 60;
        return String.format("%02d", hours) + "h " + String.format("%02d", minutes) + "m " + String.format("%02d", seconds) + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

}
