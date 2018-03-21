package challenge;

public class Nikel2018
{
//    private int  cont = 0;
    public int solution(boolean[] P) {
        int total = 0;
        for(int i = 0; i<P.length;i++){
            if(P[i]){
                total++;
            }
        }

        return  numTrues(P);

    }

    private int  numTrues(boolean[] array){
        int cont = 0;
        if(array.length == 1){
            if(array[0]){
                return 1;
            }else{
                return 0;
            }
        }else{
            boolean[] resp = new boolean[array.length-1];
            if(array[0])
                cont++;
            for(int i=0; i<array.length-1;i++){
                resp[i] = array[i]||array[i+1];
                if(array[i+1]){
                    cont++;
                }
            }
            return cont + numTrues(resp);
        }

    }
}
