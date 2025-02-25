/*DESAFIO 05
 * TESOURO ESCONDIDO    
 * VINICIUS VICTOR E VICTOR GABRIEL
 */

public class q5 {
    public static void main(String[] args) {

        int[] numDesafio4 = {1,2,3,2,1,4};
        String palavraMagica = "TesouroEncontrado".toLowerCase();

        int soma = 0; 

        for(int i = 0; i<numDesafio4.length; i++){
            soma += numDesafio4[i];
        }
        int cont = 0;
        for(int i=0; i < palavraMagica.length(); i++){
            char l = palavraMagica.charAt(i);
            if('a' == l || 'e' == l || 'i' == l || 'o' == l || 'u' == l){
                cont++;
            }
        }
        int codCadeado = cont*soma;

        System.out.println(codCadeado);
    }
}
