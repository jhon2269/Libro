/**
 * ESERCIZIO 5.7
 * Si realizzi una classe Java che abbia definito il metodo ordinaEStampa che accetta in ingresso tre valori
 * interi e visualizza quindi gli interi in ordine crescente. Si scriva un programa driver per collaudare il metodo.
 */

package esercizi.es05;

public class Esercizio07 {

    public static void ordinaEStampa(int num1, int num2, int num3){
        int temp;
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("I tre numeri in ordine crescente sono: " + num1 + ", " + num2 + " e " + num3);
    }

}