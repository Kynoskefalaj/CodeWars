//Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
//
//HH = hours, padded to 2 digits, range: 00 - 99
//MM = minutes, padded to 2 digits, range: 00 - 59
//SS = seconds, padded to 2 digits, range: 00 - 59
//The maximum time never exceeds 359999 (99:59:59)

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int sec = (seconds % 3600) % 60;
        int minutes = (seconds % 3600) / 60;
        int hours = seconds / 3600;

        String strSec = Integer.toString(sec);
        String strMinutes = Integer.toString(minutes);
        String strHours = Integer.toString(hours);

        if (sec >= 0 && sec < 10) {
            strSec = "0" + sec;
        }
        if (minutes >= 0 && minutes < 10) {
            strMinutes = "0" + minutes;
        }
        if (hours >= 0 && hours < 10) {
            strHours = "0" + hours;
        }

        return String.format("%s:%s:%s", strHours, strMinutes, strSec);
    }

    public static String makeReadable2(int seconds) {
        int h = seconds / 3600;
        int min = seconds % 3600 / 60;
        int sec = seconds % 60;

        return String.format("%02d:%02d:%02d", h, min, sec);
    }
}