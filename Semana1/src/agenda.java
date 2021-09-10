//Programa que usa o Switch case para restornar numero de telefone.

import java.util.Scanner;

public class agenda {
    public static void main(String[] args) {
        String [] telefone = {"(81 99999-999", "(91) 88888-8888"};
        String [] nomes = {"hermione", "harry"};
        System.out.println("Informe um nome para obter o numero de telefone: ");

        Scanner sc = new Scanner(System.in);

        String entrada = sc.next();
        entrada = entrada.toLowerCase();
        switch (entrada){
            case "hermione":
                System.out.println(telefone[0]);
                break;
            case "harry":
                System.out.println(telefone[1]);
                break;
            default:
                System.out.println("nome inválido");
                break;
        }
        sc.close();
    }
}
