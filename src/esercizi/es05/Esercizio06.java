/**
 * ESERCIZIO 5.6
 * Si realizzi una classe java che definisce:
 *  a. il metodo con nome trova che accetta in ingresso una stringa e un carattere e restituisce true se
 *     il carattere è presente almeno una volta nella stringa;
 *  b. il metodo main che legge in input due stringhe inserite dall'utente. Se le due stringhe hanno la
 *     stessa lunghezza, invoca il metodo trova passandogli la prima stringa e il primo carattere della
 *     seconda; se hanno lunghezza diversa, invoca il metodo trova passando la seconda stringa e l'ultimo
 *     carattere della prima stringa. Stampa a video il risultato dell'invocazione del metodo.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio06 {

    public static boolean trova(String stringa, char car){
        for (int i=0; i<stringa.length(); i++){
            if (stringa.charAt(i)==car)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = tastiera.next();
        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = tastiera.next();
        boolean trovato;
        if (stringa1.length() == stringa2.length())
            trovato = trova(stringa1,stringa2.charAt(0));
        else
            trovato = trova(stringa2,stringa1.charAt(stringa1.length()-1));
        boolean lunghezzaUguale = stringa1.length()==stringa2.length();
        System.out.println("Le due stringhe hanno lunghezza uguale? " + lunghezzaUguale);
        if (lunghezzaUguale)
            System.out.println("Il carattere \'" + stringa2.charAt(0) + "\' si trova nella stringa \"" + stringa1 + "\"? " + trovato);
        else
            System.out.println("Il carattere \'" + stringa1.charAt(stringa1.length()-1) + "\' si trova nella stringa \"" + stringa2 + "\"? " + trovato);
    }

}