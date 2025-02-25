/*DESAFIO 03
 * CAVERNA DOS ECHOS
 * VINICIUS VICTOR E VICTOR GABRIEL
 */

public class q3 {
    public static void main(String[] args) {
        
        int[] ar = {1,3,5,7,9,10,13,15,17,19};

        int razao = ar[1]-ar[0];

        for(int i = 0; i < ar.length-1; i++){

            if(ar[i+1]-ar[i]!=razao){
                ar[i+1] = ar[i]+razao;
            }
            System.out.println(ar[i]);
        }
        System.out.println(ar[ar.length-1]);

    }
}
