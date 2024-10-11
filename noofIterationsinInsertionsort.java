public class Solution {
    public int solve(int[] A) {
        int N = A.length;

        int swaps = 0;

        for(int i = 0; i<N; i++){
            int k = i;
            for(int j = i+1; j<N; j++){
                
                if(A[j]<A[k]){
                    int temp = A[j];
                    A[j] = A[k];
                    A[k] = temp;
                    k++;
                    swaps++;
                }
            }
        }
        return swaps;

        
    }
}
