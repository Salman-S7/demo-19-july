package com.examples.LambdaEx;


import java.util.Scanner;

@FunctionalInterface
interface FunctionalDemo{
    public boolean validateName();
}
public class LabdaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String s = sc.next();
        System.out.println("Enter id");
        String id = sc.next();
        FunctionalDemo f = ()->{
            return s.matches("[a-zA-z]{5,10}");
        };
        FunctionalDemo f1 = ()->{
            return id.matches("[a-zA-Z]\\d{5}");
        };
        System.out.println(f.validateName()?"Name is valid":"Name is invalid");
        System.out.println(f1.validateName()?"id is valid":"id is invalid");


    }

}
