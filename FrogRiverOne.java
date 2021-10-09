package JavaRevisions;

public class FrogRiverOne {

        public int solution(int X, int[] A) {
            // write your code in Java SE 8
            int n = A.length;
            
            if((X+1)> n){
                return -1;
            }else{
          
            for(int i = 0; i < n; i++){
                if(A[i]== X){
                    return i;
                }
            }
            
            }
           
            return -1;
           
        }
}
