package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 2; i <= 8; i++){
            System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println(isPrime(0));
        int count = 0;
        for(int n=0; n<50; n++){
            if(isPrime(n)){
                count++;
                System.out.println(n);
                if(count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }

    public static boolean isPrime(int n){
        if(n == 1 ){
            return false;
        }else{
            for(int i=2; i <= (long) Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }

    }
}
