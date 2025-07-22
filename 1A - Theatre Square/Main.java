import java.util.Scanner;

public class Main {
    public static void main(String arguments[]){
        //es necesario verficar la altura y ancho del area total
        
        //variables
        Scanner lector = new Scanner(System.in);
        // Entrada
        String entrada = lector.nextLine();

        //separación de constantes
        int n = Integer.parseInt(entrada.split(" ")[0]);
        int m = Integer.parseInt(entrada.split(" ")[1]);
        int a = Integer.parseInt(entrada.split(" ")[2]);

        //variables acumulativas y resultado
        long acumM=0, acumN = 0, total = 0;
        
        if(n%a != 0){
            for(int i=a; i<n; i+=a){
                acumN += 1;
            }

            if((acumN*a) <n){
                acumN++;
            }
        }else{
            acumN = n/a;
        }
        if(m%a != 0){
            for(int i=a; i<m; i+=a){
                acumM += 1;
            }
            if((acumM*a) < m){
                acumM++;
            }
        }else{
            acumM = m/a;
        }
        total = acumM * acumN;
        System.out.println(total);
    }
}
