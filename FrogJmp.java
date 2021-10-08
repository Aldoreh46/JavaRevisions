package JavaRevisions;

import java.util.*;

public class FrogJmp {
    
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
       int count =0;
        //int sum = X;

     /*  if(X >= Y){
          return count;
      }else{      
        do{
            sum = sum + D;
            count++;
        }while(sum < Y);

      }  */

      count = Y/D;
      int sum = (count*D) + X;

      while(sum < Y){
          sum = sum + D;
          count++;
      }

        return count;
    }
}
