package challenge;

public class Ferrum2018 {
    public int solution(int[] A) {
        int maxInt = 0;
        for(int i=0; i<A.length-1; i++){
            int numInt = 1;
            int sumTotal = A[i];
            if(A.length-i <= maxInt)
                continue;
            if(sumTotal>=0){
                if(maxInt<numInt)
                maxInt = numInt;
            }
            for(int j= i+1; j<A.length; j++){
                numInt++;
                sumTotal =sumTotal + A[j];
                if(sumTotal>=0){
                    if(maxInt<numInt)
                    maxInt = numInt;
                }
            }
        }
        return maxInt;
    }
}
