package FeetToInches;

public class FeetInchToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet or inches values");
            return -1;
        }
        double cms = (feet * 12) * 2.54;
        cms += inches * 2.54;

        System.out.println(feet + "feet, " + inches + "inches = " + cms + " cm");
        return cms;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches equal to " + feet + " feet and "+ remainingInches + " inches ");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);

    }
}
