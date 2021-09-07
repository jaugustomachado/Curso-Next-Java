//Programa para receber trẽs números inteiros do usuário e listá-los em ordem crescente.

import java.util.Scanner;

public class numOrdemCrescente {

    public static void main(String[] args) {
        System.out.println("Digite três números inteiros para listagem em ordem crescente: ");
        Scanner num1 =new Scanner(System.in);
        Scanner num2 =new Scanner(System.in);
        Scanner num3 =new Scanner(System.in);

        int x=num1.nextInt();
        int y=num2.nextInt();
        int z=num3.nextInt();

        if (x<y && x<z){
            if(y<z){
                System.out.println(x + " " + y + " " + z);
            }else{
                System.out.println(x + " " + z + " " + y);
            }
        }else if(y<x && y<z){
            if(x<z){
                System.out.println(y + " " + x + " " + z);
            }else{
                System.out.println(y + " " + z + " " + x);
            }
        }else{
            if(x<y){
                System.out.println(z + " " + x + " " + y);
            }else{
                System.out.println(z + " " + y + " " + x);
            }
        }
        num1.close();
        num2.close();
        num3.close();
    }
}
