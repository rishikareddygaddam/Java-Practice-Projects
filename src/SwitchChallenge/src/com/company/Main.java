package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String month = "june";
//        switch(month.toUpperCase()){
//            case "JUNE":
//                System.out.println("A");
//                break;
//            case "JAN":
//                System.out.println("B");
//                break;
//            case "FEB":
//                System.out.println("C");
//                break;
//            case "D":
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("None");
//        }
       printDayOfTheWeek(8);




    }


    public static void printDayOfTheWeek(int day){
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
