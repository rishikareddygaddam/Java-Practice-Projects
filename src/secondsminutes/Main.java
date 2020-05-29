package secondsminutes;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(SecondsToMinutes.getDurationString(65,45));
        System.out.println(SecondsToMinutes.getDurationString(3601));
        System.out.println(SecondsToMinutes.getDurationString(-41));
        System.out.println(SecondsToMinutes.getDurationString(65,9));
    }
}
