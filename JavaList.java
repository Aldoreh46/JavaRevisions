package JavaRevisions;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList 
{

    public static void main(String[] args) 
    {
        
                
        Scanner sc = new Scanner(System.in);
        int numLines = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> intArrayList = new ArrayList<>();
        for(int i = 0;i < numLines;i++){
            intArrayList.add(sc.nextInt());
        }

        int numQueries = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numQueries; i++) 
        {               
            String q = sc.nextLine();
            
            if(q.equals("Insert")){
                String[] queryArray = sc.nextLine().split(" ");
                intArrayList.add(Integer.parseInt(queryArray[0]),Integer.parseInt(queryArray[1]));
                
            }else{
                int removeIndex = Integer.parseInt(sc.nextLine());
                intArrayList.remove(removeIndex);
            }
        }

        for(Integer num : intArrayList){
            System.out.print(num+" ");
        }
    }

}
