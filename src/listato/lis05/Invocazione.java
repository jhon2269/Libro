/**
 * LISTATO 5.8 - Esempio di invocazione di metodi annidata
 */

package listato.lis05;

public class Invocazione {

    public static int m2(int p1){
        int tmp = p1 + 1;
        return tmp;
    }

    public static int m1 (int p1, int p2){
        int val = m2(p1);
        return val * p1;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int ris = m1(a,b);
        //System.out.println(ris);
    }

}