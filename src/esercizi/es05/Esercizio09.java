/**
 * ESERCIZIO 5.9
 * Si realizzi una classe Java che definisce:
 *  a. il metodo conta che accetta in ingresso una stringa e un carattere e restituisce il numero di occorrenze
 *     del carattere all'interno della stringa;
 *  b. il metodo main che legge da input una stringa e un numero intero n. Invoca il metodo conta passandogli
 *     la stringa letta da input e il carattere che si trova in posizione n (intero letto precedentemente da
 *     input) nella stringa stessa e stampa a video un messaggio che indichi qunate volte il carattere è
 *     stato trovato nella stringa.
 *     Esempio: stringa = "Pippo", n = 2, il numero di volte in cui compare il carattere 'p' è 2.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio09 {

    // Restituisce il numero di occorrenze del carattere all'interno della stringa
    public static int conta(String stringa, char car){
        int count = 0;
        for (int i=0; i<stringa.length(); i++){
            if (stringa.charAt(i)==car)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String stringa = tastiera.next();
        System.out.print("Inserisci un intero: ");
        int num = tastiera.nextInt();
        int occorrenze = conta(stringa,stringa.charAt(num));
        System.out.println("Il numero di volte in cui compare il carattere \'" + stringa.charAt(num) + "\' è " + occorrenze);
    }

}