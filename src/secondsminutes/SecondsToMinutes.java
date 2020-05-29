package secondsminutes;

public class SecondsToMinutes {
    private static final String INVALID_MESSAGE = "Invalid values";

    public static String getDurationString(long minutes, long seconds){
        if(minutes >=0 && seconds >=0 && seconds <= 59){
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours +"h";
            if(hours < 10){
                hoursString = "0" +hoursString;
            }

            String minuteString = remainingMinutes +"h";
            if(hours < 10){
                minuteString = "0" +minuteString;
            }

            String secondString = seconds +"h";
            if(hours < 10){
                secondString = "0" +secondString;
            }

            return hoursString+" "+minuteString+" "+secondString;

        }else{
            return INVALID_MESSAGE;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);

        } else {
            return INVALID_MESSAGE;
        }
    }

}
