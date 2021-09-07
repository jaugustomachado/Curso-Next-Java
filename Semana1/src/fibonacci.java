// Programa que recebe um número e retorna o print de cada elemento da sequência fibbonacci
// até a posição referente ao número informado.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("informe o limite para retorno da sequência fibonacci: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        int num1=1;
        int num2=0;
        
        System.out.println(num2);
        System.out.println(num1);

        for (int i =0; i<numero-2; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
        sc.close();
    }
}
