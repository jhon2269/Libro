/**
 * ESERCIZIO 5.12
 * Si realizzi un programma che definisca:
 *  a. il metodo shift che accetta in ingresso una stringa daShiftare e un numero intero n e restituisce una stringa
 *     ottenuta "riavvolgendo" i caratteri della stringa di tante posizioni pari al numero passato come parametro.
 *     Per esempio, se daShiftare = "programmazione" e n = 3, il metodo restituisce "grammazionepro");
 *  b. il metodo main che continua a chiedere in input una stringa e un numero, invoca il metodo shift utilizzando
 *     nell'invocazione la stringa e il numero inseriti dall'utente ed esce dal ciclo quando il primo e l'ultimo
 *     carattere della stringa restituita dal metodo sono entrambi uguali ad 'a'.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio12 {

    // Restituisce una stringa riavvolgendo i caratteri a partire dalla posizione n + 1
    public static String shift(String daShiftare, int n){
        String appoggio1 = null;
        String appoggio2 = null;
        for (int i=0; i<n; i++){
            if (i==0)
                appoggio1 = daShiftare.valueOf(daShiftare.charAt(i));
            else
                appoggio1 += daShiftare.charAt(i);
        }
        for (int i=n; i<daShiftare.length(); i++){
            if (i == n)
                appoggio2 = daShiftare.valueOf(daShiftare.charAt(i));
            else
                appoggio2 += daShiftare.charAt(i);
        }
        return appoggio2 + appoggio1;

    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String stringa, stringaRestituita = null;
        int n = 0;
        do {
            System.out.print("Inserisci una stringa: ");
            stringa = tastiera.next();
            System.out.print("Inserisci un numero: ");
            n = tastiera.nextInt();
            stringaRestituita = shift(stringa,n);
            System.out.println(stringaRestituita);
        } while (!(stringaRestituita.charAt(0)=='a' && stringaRestituita.charAt(stringaRestituita.length()-1)=='a'));

    }

}