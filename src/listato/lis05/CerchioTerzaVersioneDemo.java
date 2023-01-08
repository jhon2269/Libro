/**
 * LISTATO 5.6 - Invocazione di un metodo con parametro
 */

package listato.lis05;
import java.util.Scanner;

public class CerchioTerzaVersioneDemo {

    public static void main(String[] args) {
        System.out.println("Area del cerchio di raggio 2: " + CerchioTerzaVersione.areaCerchio(2));
        System.out.println("Si inserisca il raggio del cerchio: ");
        Scanner tastiera = new Scanner(System.in);
        double valore = tastiera.nextDouble();
        double area = CerchioTerzaVersione.areaCerchio(valore);

        System.out.println("Area del cerchio di raggio " + valore + ": " + area);
    }

}