package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(numDigits(125));
        System.out.println(numDigits(-125));
        System.out.println(numDigits(4));
        System.out.println(numDigits(1048));

    }

    public static int numDigits(int number){

        if(number < 10){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            number = number / 10;
            sum += digit;
        }
        return sum;
    }
}
