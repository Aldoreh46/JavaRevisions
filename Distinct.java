package JavaRevisions;
import java.util.*;

public class Distinct {
    public int solution(int[] A) {
        int count = 0;
        int length = A.length;

        Arrays.sort(A);

        if(length <=1){
            if(length == 1){
                count++;
            }
        }else{

        for(int x = 0; x < length-1; x++){

            if(A[x] != A[x+1]){
                
                count++;

            }
           
        }

        if(A[length-1] != A[length-2]){
            count++;
        }

        }

        return count;
    }
}
