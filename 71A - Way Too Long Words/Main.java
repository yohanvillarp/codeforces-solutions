import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
    
        int n = lector.nextInt();
        String[] palabras = new String[n];
        String[] salidas = new String[n];

        for(int i=0; i<n; i++){
            palabras[i] = lector.next();
            int longitud = palabras[i].length();
            if(longitud>10){
                char first = palabras[i].charAt(0);
                char last = palabras[i].charAt(longitud-1);
                palabras[i] = ""+first + (longitud-2) + last;
            }
            salidas[i] = palabras[i];
        }

        for(String salida: salidas){
            System.out.println(salida);
        }
        
    }
    
}


