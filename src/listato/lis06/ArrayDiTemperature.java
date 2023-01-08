/**
 * LISTATO 6.1 - Un array di temperature
 * Legge i valori di 7 temperature inserite dall'utente e mostra quali di
 * esse sono al di sopra e al di sotto della media delle temperature stesse.
 */

package listato.lis06;
import java.util.Scanner;

public class ArrayDiTemperature {

    public static void main(String[] args) {

        double [] temperatura = new double[7];

        //Lettura delle temperature e calcolo della loro media:
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire 7 temperature:");
        double somma = 0;

        for (int i=0; i<7; i++){
            temperatura[i] = tastiera.nextDouble();
            somma = somma + temperatura[i];
        }

        double media = somma/7;
        System.out.println("La temperatura media e' " + media);

        //Mosta ogni temperatura e al relazione rispetto alla temperatura media:
        System.out.println("Le 7 temperature sono");
        for (int i=0; i<7; i++){
            if (temperatura[i] < media)
                System.out.println(temperatura[i] + " sotto la media");
            else if (temperatura[i] > media)
                System.out.println(temperatura[i] + " sopra la media");
            else
                System.out.println(temperatura[i] + " pari alla media");
        }

        System.out.println("Buona settimana.");
    }

}