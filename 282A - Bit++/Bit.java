import java.util.Scanner;

public class Bit {
    public static void main(String arguments[]){
        Scanner lector = new Scanner(System.in);
        
        int n = lector.nextInt();
        String sentencia = "";
        int x = 0;
        lector.nextLine();
        for(int i=0; i<n; i++){
            sentencia = lector.nextLine();
            char accion = sentencia.charAt(1);
            if(accion=='-') x--;
            else            x++;
        }
        System.out.println(x);
    }    
}
