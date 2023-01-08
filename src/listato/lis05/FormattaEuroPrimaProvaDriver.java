/**
 * LISTATO 5.10 - Un programma driver che collauda la classe FormattaEuroPrimaProva
 */

package listato.lis05;
import java.util.Scanner;

public class FormattaEuroPrimaProvaDriver {

    public static void main(String[] args) {
        double somma;
        String risposta;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Test FormattaEuroPrimaProva.scrivi:");

        do{
            System.out.println("Inserisci un valore di tipo double:");
            somma = tastiera.nextDouble();
            FormattaEuroPrimaProva.scrivi(somma);
            System.out.println();
            System.out.println("testare ancora?");
            risposta = tastiera.next();
        } while (risposta.equalsIgnoreCase("si"));

        System.out.println("Fine del test.");
    }

}