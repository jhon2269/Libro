/**
 * LISTATO 5.4 - Variabili locali a un metodo
 */

package listato.lis05;

public class CerchioSecondaVersione {

    public static double areaCerchioRaggio2(){
        double risultato = 3.14159 * 2 * 2;
        return risultato;
    }

    public static void main(String[] args) {
        double risultato = 30.8;
        double area = areaCerchioRaggio2();
        System.out.println("Area del cerchio di raggio 2: " + area);
        System.out.println("Risultato vale ancora: " + risultato);
    }

}