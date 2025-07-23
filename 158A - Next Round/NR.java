import java.util.Scanner;

public class NR {
    public static void main(String arguments[]) {
        Scanner lector = new Scanner(System.in);

        // solicitamos datos
        String nk = lector.nextLine();
        String posiciones = lector.nextLine();

        // identificamos datos
        int n = Integer.parseInt(nk.split(" ")[0]);
        int k = Integer.parseInt(nk.split(" ")[1]);

        // acumulamos las posiciones en un arreglo
        int i = 0;
        int num = 0;
        int value = 0;
        int valorActual = 0;

        for (String p : posiciones.split(" ")) {
            valorActual = Integer.parseInt(p);
            if (valorActual == 0) {
                num = i;
                break;
            } else if (value != 0) {
                if (valorActual < value) {
                    num = i;
                    break;
                }
            }
            if (i == (k - 1))
                value = valorActual;

            if (i == (n - 1) && value != 0)
                num = n;
            i++;
        }

        // resp
        System.out.println(num);
        lector.close();
    }
}
