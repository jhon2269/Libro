/**
 * ESERCIZIO 5.10
 * Si realizzi una classe Java che definisce il metodo main che continua a chiedere in ingresso una stringa
 * finché l'utente inserisce la parola "fine". Per ogni stringa inserita, verifica se la stringa contiene più
 * di 5 vocali (utilizzando il metodo contaVocali definito nell'esercizio 5). Memorizza in una variabile di
 * appoggio piuLunga la stringa inserita con più di 5 vocali e che è al momento la più lunga inserita.
 * All'uscita dal ciclo stampa il valore della varibile piuLunga.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio10 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String stringa, piuLunga = null;
        int vocali;
        do {
            System.out.print("Inserisci una stringa: ");
            stringa = tastiera.next();
            vocali = Esercizio05.contaVocali(stringa);
            if (vocali > 5)
                piuLunga = stringa;
        } while (!stringa.equals("fine"));
        System.out.println("La stringa con più di cinque vocali è: " + piuLunga);
    }

}