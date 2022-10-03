/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplesec;

import java.util.Scanner;

/**
 *
 * @author tsist
 */
public class ExampleSec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Put a number");
        //int a = scanner.nextInt(); 
        //System.out.println("Put a second number");
        //int b = scanner.nextInt();
        //if (a>b){
        //    System.out.println("Yes it is right"); 
        //}
        //if (a==0 || b==0 || a>=10){
        //    System.out.println("You cant write null, try again please");
        //}
        //else{
        //    System.out.println("No it is not");
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Write a role");
        //String role = scanner.nextLine();
        //System.out.println("Write a password");
        //String pass = scanner.nextLine();
        //if(role.equals ( "admin") && pass.equals("12345")){
            //System.out.println("All users");
            
        
        //}else{
            //System.out.println("Hi, how are u?");
            //String name = scanner.nextLine();
        //}
        
        
        //int num = scanner.nextInt();
        //switch(num){
            //case 1:
                //System.out.println("Number is 1");
                //break;
            //case 2:
                //System.out.println("Number is 2");
                //break;
            //case 3:
                //System.out.println("Number is 3");
                //break;
            //case 4:
                //System.out.println("Number is 4");
                //break;
            //default:
                //System.out.println("Default");
        //}
        
        System.out.print("Write first number - ");
        int num1 = scanner.nextInt();
        
        System.out.print("Write second number - ");
        int num2 = scanner.nextInt();
        
        int res;
        
        System.out.print("What to do : ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        
        
        
        
        switch(action){
            case "+":
                res = num1 + num2;
                System.out.println("Result " + res);
                break;
                
            case "-":
                res = num1 - num2;
                System.out.println("Result " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result " + res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.println("Error");
                else{
                    res = num1 / num2;
                    
                    System.out.println("Result " + res);
                }
                break;
            default:
                System.out.println("Something went wrong");
                
        }
        
    }    
}
