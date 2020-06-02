package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while(number <= finishNumber){
            number++;
           if(isEvenNumber(number)){
               count++;
               System.out.println("even"+number);
               if(count==5){
                   break;
               }
           }
        }
        System.out.println(count);
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
