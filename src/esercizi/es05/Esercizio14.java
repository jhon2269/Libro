/**
 * ESERCIZIO 5.14
 * Si realizzi una classe Java che definisce:
 *  a. il metodo areaRettangolo che calcola e restituisce l'area di un rettangolo date la base e l'altezza. La
 *     base e l'altezza sono di tipo int così come l'area calcolata e restituita;
 *  b. il metodo areaQuadrato che accetta in ingresso il lato e sfrutta il metodo areaRettangolo per calcolare
 *     l'area del quadrato. L'area calcolata viene restituita. Sia il lato che l'area calcolata e restituita
 *     sono di tipo int;
 *  c. il metodo main che chiede all'utente un valore per la base e uno per l'altezza e stampa a video il
 *     ritorno dell'invocazione al metodo areaRettangolo. Chiede infine all'utente il lato di un quadrato e
 *     stampa a video il ritorno dell'invocazione al metodo areaQuadrato.
 */

package esercizi.es05;

import java.util.Scanner;

public class Esercizio14 {

    public static int areaRettangolo(int base, int altezza){
        int area = base * altezza;
        return area;
    }

    public static int areaQuadrato(int lato){
        int area = areaRettangolo(lato,lato);
        return area;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("RETTANGOLO");
        System.out.print("Inserisci la base del rettangolo: ");
        int base = tastiera.nextInt();
        System.out.print("Inserisci l'altezza del rettangolo: ");
        int altezza = tastiera.nextInt();
        System.out.println("Area del rettangolo: " + areaRettangolo(base,altezza));
        System.out.println();
        System.out.println("QUADRATO");
        System.out.print("Inserisci il lato del quadrato: ");
        int lato = tastiera.nextInt();
        System.out.println("Area del quadrato: " + areaQuadrato(lato));

    }

}