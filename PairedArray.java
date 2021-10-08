package JavaRevisions;

public class PairedArray {
   
    public int solution(int[] A) {
        
        int length = A.length;
        int sum = 0;
        int result = 0;

        for(int i = 0; i < length; i++){

            if(sum%2 ==1 && sum != 0){
                return result;
            }else{
                 sum = 0;
            }
          
            for(int j = 0; j< length; j++){

                result = A[i];
                if(A[i] == A[j]){
                    sum++;
                }
            }
        }

        
        return result;
    }
}
