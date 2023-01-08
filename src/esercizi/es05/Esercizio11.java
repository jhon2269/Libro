/**
 * ESERICIZIO 5.11
 * Si realizzi un programma che defnisica:
 *  a. il metodo inverti che accetta in ingresso una stringa daInvertire e un intero n e restitusce una stringa
 *     con i caratteri invertiti a partire dal carattere di indice n, se l'indice è valido (se, per esempio,
 *     daInvertire = "programmazione" e n=5, il metodo restitusce "progrenoizamma") oppure restitusce la
 *     stringa "errore";
 *  b. il metodo main che legge da input standard una stringa e un intero positivo n, invoca il metodo inverti
 *     utilizzando la stringa e il numero inseriti dall'utente e stampa la stringa restituita oppure un messaggio
 *     che avverta l'utente che c'è stato un errore.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio11 {

    // Restituisce la stringa invertita a partire dal indice n
    public static String inverti(String daInvertire, int n){

        String stringaInvertita = null;

        if(n<=daInvertire.length()){
            // Formazione della parte della stringa senza invertire
            int i=0;
            while (i<n){
                if (i==0)
                    stringaInvertita = daInvertire.valueOf(daInvertire.charAt(i));
                else
                    stringaInvertita = stringaInvertita + daInvertire.charAt(i);
                i++;
            }
            // Formazione della parte della stringa invertita
            i = daInvertire.length();
            int lunghezza = stringaInvertita.length();
            while (i > lunghezza){
                stringaInvertita = stringaInvertita + daInvertire.charAt(i-1);
                i--;
            }
            return stringaInvertita;
        }
        else
            return "errore";
    }

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String stringa = tastiera.next();
        int n = 0;
        do {
            System.out.print("Inserisci un intero positivo: ");
            n = tastiera.nextInt();
            if (n<=0)
                System.out.println("Attenzione! Il numero inserito non è un intero positivo!");
        } while (n<=0);
        System.out.print(inverti(stringa,n));

    }
}