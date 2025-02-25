/*DESAFIO 04
 * TEMPLO DA SABEDORIA
 * VINICIUS VICTOR E VICTOR GABRIEL
 */

public class q4 {
    public static void main(String[] args) {

        String[] avatar = {"Terra", "Ar", "Agua", "Ar", "Terra", "Fogo"};

        for(int i = 0; i<avatar.length; i++){
            if(avatar[i].equals("Terra")){
                System.out.printf("1");
            }
            if(avatar[i].equals("Ar")){
            System.out.printf("2");
            }
            if(avatar[i].equals("Agua")){
                System.out.printf("3");
            }
            if(avatar[i].equals("Fogo")){
                System.out.printf("4");
            }
        }
    }
}
