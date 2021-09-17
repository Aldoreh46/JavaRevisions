package JavaRevisions;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int m = 1;
            int sum = 0;

            for(int j = 1; j <= n; j++){
               
                if( j == 1){
                    sum = sum + (m * b) + a;
                    System.out.print(sum + " ");
                }else{

                    sum = sum + ((m * b));
                    m = 2 * m;
                    System.out.print(sum + " ");
                } 

                
            }   

            System.out.println(" ");
        }


        in.close();
    }
}