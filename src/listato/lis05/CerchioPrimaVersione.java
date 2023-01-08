/**
 * LISTATO 5.3 - Definizione del metodo areaCerchio e sua invocazione
 */

package listato.lis05;

public class CerchioPrimaVersione {

    public static double areaCerchioRaggio2(){
        return 3.14159 * 2 * 2;
    }

    public static void main(String[] args) {
        double area = areaCerchioRaggio2();
        System.out.println("Area del cerchio di raggio 2: " + area);
        System.out.println("Area del cerchio di raggio 2: " + areaCerchioRaggio2());
    }

}