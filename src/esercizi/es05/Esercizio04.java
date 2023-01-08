/**
 * ESERCIZIO 5.4
 * Si realizzi una classe Java che abbia definito un metodo che accetta in ingresso 3 interi min, max e valore.
 * Tale metodo deve verificare se valore è all'interno dell'intervallo min - max estremi inclusi. Se è all'interno,
 * il metodo restituisce true, false in caso contrario.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio04 {

    public static boolean compresso(int min, int max, int valore){

        if (valore >= min && valore <= max)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci il valore minimo: ");
        int min = tastiera.nextInt();
        System.out.print("Inserisci il valore massimo: ");
        int max = tastiera.nextInt();
        System.out.print("Inserisci il valore che vuoi controllare: ");
        int valore = tastiera.nextInt();
        System.out.println(valore + " è compresso negli intervalli " + min + " - " + max + " (estremi inclusi)? " + compresso(min,max,valore));

    }

}