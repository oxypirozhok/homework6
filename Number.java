package com.homework6;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        //First level
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number == 0) {
            System.out.println("no errors were found");
        }else{
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }
        // Second level
        String password = scan.next();

        int passwordSize = password.length();

        char lastSymbol = password.charAt(passwordSize - 1);

        String lastPasswordsSymbol = String.valueOf(lastSymbol);

        if (passwordSize > 6 || lastPasswordsSymbol.equals("!")){
            System.out.println("Your password is right.");
        }else{
            System.out.println("Your password is wrong.");
        }

    }
}
