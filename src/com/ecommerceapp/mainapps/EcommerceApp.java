package com.ecommerceapp.mainapps;

import java.util.Scanner;

/**
 * @author prashanth
 * @Date 15-Jul-22
 */
public class EcommerceApp {

    public static void main(String[] args){
       System.out.println("--------------------Welcome to Ecommerce Site for Machines!----------------------------");
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your User name");
       String userName = scanner.nextLine();
       System.out.println("Mr/Mrs"+""+userName+""+"Enter your Password");
       String passWord = scanner.nextLine();
       System.out.println(""+passWord);
    }
}
