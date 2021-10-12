package JavaRevisions;

public class MaxSlice {
    public int solution(int[] A) {
        
        int max = A[0];
        int length = A.length;

        if(length == 1){
            return A[0];
        }else if(A == null || length <= 0){
            return 0;
        }

        for(int x = 0; x < length-1; x++){

            if((A[x]+A[x+1]) > max){
                max = A[x]+A[x+1];
            }else if(A[x]> max){
                max = A[x];
            }
        }
        
        if((A[length - 2 ]+A[length-1]) > max){
                max = A[length - 2 ]+A[length-1];
            }else if(A[length-1]> max){
                max = A[length-1];
            }

        return max;
    }
}
