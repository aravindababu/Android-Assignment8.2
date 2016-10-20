/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author user2
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaring Scanner variable to take input from user
         Scanner S1 = new Scanner(System.in);  
 
          System.out.println("Enter Your Age");
 
          //Taking input from user
          int age = S1.nextInt();         
 
          try
          {
              if(age < 0)
              {
                  //throws AgeIsNegativeException if age is negative
                  throw new UserException("Age can not be negative");    
              }
          }
          catch(UserException ex)
          {
              System.out.println(ex);
              
          }
    }   
}
//Creating a class which defines our Exception

class UserException extends Exception{
    //Defining a String Variable to display the exception 
    String message;
    
    //Defining UserException Constructor 
    UserException(String message){
        this.message=message;
    }
    //Modifying toString() method to display customized error message
 
    @Override
    public String toString()
    {
        return message;
    }
}