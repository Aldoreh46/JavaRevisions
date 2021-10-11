package JavaRevisions;
import java.util.*;

public class Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 
        int value = 0;
        int size = 0;
        //We calculate the value of the most value of appear from the array
        //We keep that in the value. 
        for (int i = 0; i < A.length; i++) {
            if(size == 0) {
                size++;
                value = A[i];
            } else {
                if (value != A[i]) {
                    size -=1;
                } else {
                    size++;
                }
            }
        }
        int candidate = -1;
        if(size > 0) {
            candidate = value;
        }
        int index = -1;
        int count = 0;
        //This step determine wheter the most element of the array is more than half of array length!
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                count++;
                index = i;
            }
        }
        
        //if it's not more than half we return -1
        //otherwise we return the index... 
        //Note here we don't return the value itself..
        
        if(count > (A.length/2)) {
            return index;
        } else {
            return -1; 
        }
    
    }
}
