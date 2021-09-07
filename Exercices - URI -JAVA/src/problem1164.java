import java.util.Scanner;

public class problem1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int soma =0;
    
        for (int i =0; i<N ; i++){
            int numero=sc.nextInt();
            for (int j=1;j<numero;j++){
                if(numero%j==0){
                    soma=soma+j;
                }
            }  
            if (soma==numero){
                System.out.println(numero+" eh perfeito");
            }else{
                System.out.println(numero+" nao eh perfeito");
            }
            soma=0;
        }
        sc.close();
    }
}
