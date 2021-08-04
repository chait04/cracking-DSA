package com.chaitanya;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = in.nextInt();

        if(num <= 1){
            return;
        }

        int temp = 2;

        if(num == 4){
            System.out.println("Not prime");
        } else {
            while(temp * temp < num ){
                if( num % temp == 0 ){
                    System.out.println("Not prime");
                }
                temp = temp + 1;
            }
            if(temp * temp > num){
                System.out.println("Number is Prime");
            }
        }
    }

}
