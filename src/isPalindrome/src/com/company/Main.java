package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1 ;
        }
        int num = number;
        int reverse = 0;

        while(num != 0){
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        if(reverse  == number){
            return true;
        }
        return false;
    }
}

