import challenge.Ferrum2018;
import challenge.Nikel2018;

public class Main {
    public static void main(String[] args) {

//        int[] array = {-1,-1,1,-1,1,0,1,-1,-1};
//        int[] array = {1,1,-1,-1,-1,-1,-1,1,1};
        boolean[] array = {true,false,false,true};
//        Ferrum2018 challenge = new Ferrum2018();
//        int resp = challenge.solution(array);

        Nikel2018 nikel = new Nikel2018();
        int resp = nikel.solution(array);
        System.out.println("Respuesta: "+ resp);
    }
}
