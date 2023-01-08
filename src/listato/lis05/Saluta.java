/**
 * LISTATO 5.1 - Definizione del metodo saluta e sua invocazione
 */

package listato.lis05;

public class Saluta {

    public static void saluta(){
        System.out.println("Ciao!");
    }

    public static void main(String[] args) {
        System.out.println("Prima dell'esecuzione...");
        saluta();
        System.out.println("...Dopo l'esecuzione");
    }

}