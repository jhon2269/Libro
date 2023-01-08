/**
 * ESERCIZIO 5.3
 * Si realizzi una classe Java che abbia definito un metodo chiamato divisibile che accetta in ingresso due interi
 * e restituisce true se il primo intero è divisibile per il secondo, false in caso contrario.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio03 {

    public static boolean divisibile(int num1, int num2){

        if (num1 % num2 == 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci il primo intero: ");
        int num1 = tastiera.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = tastiera.nextInt();
        System.out.println(num1 + " è divisibile per " + num2 + "? "+ divisibile(num1,num2));

    }

}