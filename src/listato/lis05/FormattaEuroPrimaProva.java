/**
 * LISTATO 5.9 - La classe FormattaEuroPrimaProva
 */

package listato.lis05;

public class FormattaEuroPrimaProva {

    /**
     * Mostra l'amontare in Euro e centessimi.
     * Arrotonda dopo due decimali.
     * Non inserisce una nuova riga dopo la fine dell'output
     */

    public static void scrivi(double somma){
        int centessimiTotali = (int)(Math.round(somma * 100));
        int euro = centessimiTotali / 100;
        int centessimi = centessimiTotali % 100;

        System.out.print('E');
        System.out.print(euro);
        System.out.print('.');

        if (centessimi < 10){
            System.out.print('0');
            System.out.print(centessimi);
        } else
            System.out.print(centessimi);

    }

    /**
     * Mostra l'ammontare in Euro e centessimi.
     * Arrotonda dopo due decimali.
     * Inserisce una nuova riga dopo la fine dell'output.
     */

    public static void scriviRiga(double somma){
        scrivi(somma);
        System.out.println();
    }

}