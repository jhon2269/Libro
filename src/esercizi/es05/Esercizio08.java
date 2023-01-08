/**
 * ESERCIZIO 5.8
 * Si realizzi una classe Java che definisce:
 *  a. il metodo primo che accetta in ingresso un numero intero e restituisce true se il numero è primo oppure
 *     restituisce false (un numero è primo se è divisibile solo per 1 o per se stesso);
 *  b. il metodo divisiore che prende in ingresso un numero intero e restituisce il suo minimo divisore (escluso 1);
 *  c. il metodo main che legge in input un numero intero diverso da 0 e, utilizzando i metodi primo e divisore,
 *     stampa a video il messaggio "il numero inserito è un numero primo" se il numerio inserito è primo,
 *     altrimenti stampa il messaggio "il più piccolo divisore di N è D", dove N e D devono essere il numero
 *     inserito dall'utente e il suo divisore.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio08 {

    // Verifica se un numero è primo
    public static boolean primo(int num){

        if (num < 2)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)   // Controllo se è pari
            return false;   // I numeri pari non sono primi
        int divisore = 3;
        while (divisore <= Math.sqrt(num)){
            if (num % divisore == 0)
                return false;   // ha trovato un divisore
            divisore +=2;       // Continuo solo con i divisori dispari
        }

        return true;

    }

    // Prende in ingresso un numero intero e restituisce il suo minimo divisore (escluso 1)
    public static int divisore(int num){

        int divisore = 2;
        while (divisore <= num){
            if (num % divisore == 0){
                return divisore;
            }
            divisore++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un numero intero diverso da 0: ");
        int num = tastiera.nextInt();
        if (primo(num))
            System.out.println("Il numero inserito è un numero primo");
        else
            System.out.println("Il più piccolo divisore di \'" + num + "\' è " + divisore(num));
    }

}