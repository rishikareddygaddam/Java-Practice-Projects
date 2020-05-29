package secondsminutes;

public class SecondsToMinutes {
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
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);

        } else {
            return "Invalid value";
        }
    }

//    public static String getDurationString(long minutes, long seconds){
//        if(minutes < 0 || seconds < 0 || seconds > 59){
//            return "Invalid value";
//        }
//        long hours = minutes / 60;
//        long remainingMinutes = minutes % 60;
//        return hours+"h"+" "+remainingMinutes+"m"+" "+seconds+"s";
//    }
//
//    public static String getDurationString(int seconds){
//        if(seconds < 0){
//            return "Invalid value";
//        }
//        long minutes = seconds/60;
//        long remainingSeconds = seconds%60;
//        return getDurationString(minutes,remainingSeconds);
//    }


}
