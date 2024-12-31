import java.util.ArrayList;
public class List {
    public static void main(String[] args) {

        /*Crea una lista di numeri interi*/
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        numeri.add(4);
        numeri.add(5);

        /*Stampa solo i numeri pari*/
            for (int numero : numeri) {
            if (numero % 2 == 0) {
                System.out.println(numero + " è pari!");
            }
        }
    }
}
