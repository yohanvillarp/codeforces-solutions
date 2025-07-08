import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int w = lector.nextInt();
        String seParte = "NO";
        boolean isPar = (w%2 == 0) && (w > 2) && (w <= 100);
        if(isPar)   seParte = "YES";
        System.out.println(seParte);

    }
}