package JavaRevisions;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

public class Scan 
{

    public static void main(String[] args) 
    {
        
        //int myInt;
        Scanner scanner = new Scanner(System.in);
 
                try
                {   
                    System.out.println("Enter String");
                    String myString = scanner.next();
                   
                    if(myString instanceof String)
                    {
                        System.out.println("myString is: " + myString);
                    }
                    try
                    {
                       System.out.println("Enter Integer");
                       Integer myInt = scanner.nextInt();
                       scanner.close();
                       System.out.println("mInt is: " + myInt);                   
                   
                    }
                    catch(NumberFormatException exception)
                    {
                       System.out.println("This is not an string");
                    } 

                }
                catch(InputMismatchException exception)
                {
                    System.out.println("This is not an integer");
                }
                
    }
    

        
        
        
       

}
