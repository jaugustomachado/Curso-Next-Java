// Programa para descobrir as pessoas de um grupo que fazem em aniversário em JAN ou FEV.

import java.util.Scanner;

public class aniverJanFev {
    public static void main(String[] args) {
        System.out.println("informe o número do mês para descobrir os aniversariantes de janeiro ou fevereiro: ");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        switch(mes){

            case 1:
            System.out.println("Roger e Daniel");
            break;

            case 2:
            System.out.println("Maria e Ralu");
            break;

            default:
            System.out.println("Ninguém");
            break;
        }
        sc.close();
    }
}
