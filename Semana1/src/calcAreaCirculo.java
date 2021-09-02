// Programa para calcular a área do círculo e caso o raio seja maior que 3.5 também é calculado
// o comprimento de sua circunferência.

import java.util.Scanner;

public class calcAreaCirculo {
    public static void main(String[] args) {
        System.out.println("informe o raio para cálculo da área do círculo");
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double area =Math.PI*Math.pow(raio,2);
        System.out.printf("área é igual a %.5f %n", area);

        if (raio>3.5){
            double circunferencia=2*Math.PI*raio;
            System.out.printf("o comprimento da circunferência é: %.5f %n",circunferencia);

        }
        sc.close();
    }
}
