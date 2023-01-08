/**
 * ESERCIZIO 5.1
 * Si realizzi una classe Java in cui è definito il metodo confronta che accetta in ingresso due interi e
 * restituisce il primo meno il secondo se il primo è maggiore del secondo, oppure restituisce il secondo
 * meno il primo. Scrivere quindi un programma driver per collaudare il metodo.
 */

package esercizi.es05;

public class Esercizio01 {

    public static int confronta(int num1, int num2){
        if (num1 > num2)
            return num1 - num2;
        else
            return num2 - num1;
    }

}