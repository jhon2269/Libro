/**
 * ESERCIZIO 5.5
 * Si realizzi una classe Java che definsice:
 *  a. il metodo contaVocali che accetta in ingresso una stringa e restituisce il numero di vocali presenti
 *     nella stringa;
 *  b. il metodo main che iterativamente chiede all'utente di inserire una stringa se la stringa inserita ha
 *     un numero di vocali minore od uguale a 5. Stampa quinid il numero di vocali dell'ultima stringa inserita.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio05 {

    // Restituisce il numero di vocali presenti nella stringa
    public static int contaVocali(String stringa){

        int count = 0;
        for (int i=0; i<stringa.length(); i++){
            switch (stringa.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        String stringa;
        do {
            System.out.print("Inserisci una stringa: ");
            stringa = tastiera.next();
            System.out.println("Numero di vocali nella stringa: " + contaVocali(stringa));
        } while (contaVocali(stringa) <= 5);

    }

}