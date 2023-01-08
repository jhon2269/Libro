package esercizi.es05;

import java.util.Scanner;

public class Esercizio01Driver {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci il primo intero: ");
        int num1 = tastiera.nextInt();
        System.out.print("Inserisci il secondo intero: ");
        int num2 = tastiera.nextInt();
        System.out.println("Numero di ritorno: " + Esercizio01.confronta(num1,num2));

    }

}