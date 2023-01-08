package esercizi.es05;

import java.util.Scanner;

public class Esercizio07Driver {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int num1 = tastiera.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = tastiera.nextInt();
        System.out.print("Inserisci il terzo numero: ");
        int num3 = tastiera.nextInt();
        Esercizio07.ordinaEStampa(num1,num2,num3);
    }

}