/*DESAFIO 02
 * ENIGMA DA PIRAMIDE
 * VINICIUS VICTOR E VICTOR GABRIEL
 */

public class q2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2,3}, 
            {4,5,6}, 
            {7,8,9}
        };

        int somaTotal = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("A soma total dos elementos da matriz é " + somaTotal);
    }
}
