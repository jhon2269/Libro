/**
 * LISTATO 5.7 - Passaggio per valore
 */

package listato.lis05;

public class ChiamataPerValore {

    public static void incrementa(int valore){
        valore = valore + 1;
    }

    public static int incrementaRitorna(int valore){
        return valore + 1;
    }

    public static void main(String[] args) {
        int dato = 3;
        incrementa(dato);
        System.out.println("dato vale: " + dato);

        dato = incrementaRitorna(dato);
        System.out.println("dato vale: " + dato);
    }

}