/**
 * ESERCIZIO 5.2
 * Si realizzi una classe Java che definisce:
 *  a. il metodo saluta che accetta in ingresso una stringa nome e un intero n e stampa a video n volte la
 *     frase "Ciao" seguita dal valore del nome. Se per esempio viene inserito Marco e 3, l'output a video
 *     dovrebbe essere:
 *      Ciao Marco
 *      Ciao Marco
 *      Ciao Marco
 *  b. il metodo main che chiede all'utente di inserire una stringa e un intero e invoca il metodo saluta
 *     con i valori letti.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio02 {

    public static void saluta(String nome, int n){

        for (int i=0; i<n; i++){
            System.out.println("Ciao " + nome);
        }

    }

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci il nome: ");
        String nome = tastiera.next();
        System.out.print("Inserisci un intero: ");
        int intero = tastiera.nextInt();
        saluta(nome,intero);

    }
}