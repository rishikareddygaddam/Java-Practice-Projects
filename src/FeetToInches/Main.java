package FeetToInches;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double centimeters = FeetInchToCentimeters.calcFeetAndInchesToCentimeters(7, 0);
        if(centimeters < 0.0){
            System.out.println("Invalid parameters");
        }

        FeetInchToCentimeters.calcFeetAndInchesToCentimeters(-10);

    }

}
