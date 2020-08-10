package com.revature;

import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter first string");
        String fs = input.nextLine();
        System.out.println("Enter second string");
        String ss = input.nextLine();
        compareStrings(fs,ss);
    }

    public static boolean compareStrings(String s1, String s2){
        if (s1.matches(s2)){
            System.out.println("they match");
        }
        else
            System.out.println("they don't match");
        return false;

    }
}
