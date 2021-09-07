// Programa que pede um número como entrada e fornece seu fatorial.

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        
        System.out.print("Digite um número para obter ser fatorial: ");
        Scanner sc = new Scanner(System.in);
        long numero = sc.nextInt();
        
        long valorInicial = numero;
        long fatorial = 1;

        while(numero>1){
            fatorial=numero*fatorial;
            numero-=1;
        }
        System.out.println("o fatorial de " + valorInicial + " é: " + fatorial);

        sc.close();
    }
}
