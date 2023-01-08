/**
 * ESERCIZIO 5.13
 * Si realizzi una classe Java che definisce:
 *  a. il metodo cercaCarattere che accetta in ingresso due stringhe, confronta a uno a uno i caratteri delle due
 *     stringhe e restituisce il primo carattere uguale trovato oppure restituisce il carattere '*' se le due
 *     stringhe non hanno nemmeno un carattere uguale;
 *  b. il metodo main che continua a leggere in input due stringhe e invoca il metodo cercaCarattere passandogli
 *     le stringhe inserite dall'utente, finché il carattere restituito dal metodo è diverso dall'ultimo
 *     carattere della prima stringa.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio13 {

    // Restituisce il il primo carattere uguale nelle due stringhe
    public static char cercaCarattere(String str1, String str2){
        char c = '*';
        for (int i=0; i<str1.length(); i++){
            for (int j=0; j<str2.length(); j++){
                if (str1.charAt(i)==str2.charAt(j)) {
                    c = str1.charAt(i);
                    break;
                }
            }
        }
        if (!(c == '*'))
            return c;
        else
            return c;
    }

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        String str1, str2 = null;
        char carUguale = ' ';

        do {
            System.out.print("Inserisci la prima stringa: ");
            str1 = tastiera.next();
            System.out.print("Inserisci la seconda stringa: ");
            str2 = tastiera.next();
            carUguale = cercaCarattere(str1,str2);
            if (carUguale != '*')
                System.out.println("Carattere uguale nelle due stringhe: " + carUguale);
            else
                System.out.println("Non ci sono caratteri uguali nelle stringhe.");
        } while (carUguale==str1.charAt(str1.length()-1));

    }

}