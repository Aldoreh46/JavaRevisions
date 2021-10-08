package JavaRevisions;

public class ArrayShift {
   
    public int[] solution(int[] A, int K) {
        
        int length = A.length; // 5
        int last = 0;

        //  A = [3, 8, 9, 7, 6]
        // K = 3

        for(int i=0; i<K; i++){
            

                last = A[length-1];

                for(int j=length -1; j > 0; j--){
                    A[j] = A[j-1];            
                }
                
                A[0]  = last;
            
        }
        return A;
    }
}
