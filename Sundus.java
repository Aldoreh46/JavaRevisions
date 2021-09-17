package JavaRevisions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Sundus 
{

    public static void main(String[] args) 
    {
        
        System.out.println("Hello, whats your name?");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
                
        

        if(myString.equals("Sundus") ||myString.equals("sundus") ){
            System.out.println("AHLEEEEN SUNDUS!!!");
            System.out.println("How can I help you today?");
        }else 
              System.out.println(myString + "? piss off this aint for u");
                
    }
    

        
        
        
       

}
