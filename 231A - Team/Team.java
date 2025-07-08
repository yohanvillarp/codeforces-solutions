import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        int n = lector.nextInt();
        String resp = "";
        int nroResp = 0;
        int asegurado = 0;
        
        lector.nextLine();

        for(int i=0; i<n; i++){
            resp = lector.nextLine();
            String seguridad[] = resp.split("\\s+");
            for(int j=0; j<seguridad.length; j++){
                if(seguridad[j].equals("1"))
                    asegurado++;
            }
            if(asegurado>1){
                nroResp++;
            }
            asegurado=0;
        }

        System.out.println(nroResp);
    }
}
