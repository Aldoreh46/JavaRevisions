package JavaRevisions;

public class MaxProductOfThree {
    public int solution(int[] A) {
        
        int length = A.length;
        int max = 0;
        int temp = 0;
        for(int x=0; x < length; x++){

            for(int y : A){
                if(y > A[x]){
                    for(int z : A){
                        if(z > y){
                            temp= A[x]*y*z;
                            max = Math.max(temp,max);
                        }
                    }
                }
            }
        }

        return max;
    }
}
