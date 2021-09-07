import java.util.Scanner;

public class problem1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        boolean teste = false;
    
        for (int i =0; i<N ; i++){
            int numero=sc.nextInt();
            if (0<numero && numero<=2){
                System.out.println(numero+" eh primo");
            }else{
                for (int j=2;j<numero;j++){
                    if(numero%j==0){
                        teste=true;
                    }
                }
                if (teste==true){
                System.out.println(numero+" nao eh primo");
                }else{
                System.out.println(numero+" eh primo");
                }
            }
            teste=false;
        }
        sc.close();
    }
}
