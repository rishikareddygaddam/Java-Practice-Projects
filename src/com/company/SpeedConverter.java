package com.company;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour <0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");

        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || ((inches < 0) && (inches > 12))){
            return -1;
        }

        double cms = (feet * 12) * 2.54;
        cms += inches * 2.54;

        System.out.println(feet + "feet, " + inches + "inches = " + cms + " cm");
        return cms;


    }
}




