//Programa que faz o input de elementos de um vetor e o retorna impresso.

import java.util.Scanner;

public class vetorScan {
    public static void main(String[] args) {
        int [] arrInteiros = new int[5];

        Scanner sc= new Scanner(System.in);

        for (int i=0;i<arrInteiros.length;i++){
            arrInteiros[i]=sc.nextInt();
        }
        
        for (int i=0 ; i< arrInteiros.length;i++){
            System.out.print(arrInteiros[i]+" ");
        }
        sc.close();
    }
}

