//Programa que calcula a média entre dois números reais.

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        
        System.out.println("Digite o primeiro número");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número");
        Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextDouble();

        double media=(num1+num2)/2;

        System.out.println("sua média é: "+ media);
        sc.close();
        sc2.close();
    }
}
