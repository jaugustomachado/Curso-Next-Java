//Programa que recebe um nome do usuário e retorna a mensagem: Olá + "entrada"

import java.util.Scanner;

public class olaNome {
    public static void main(String[] args) {
        
        System.out.println("Digite o nome: ");        
        Scanner leteclado = new Scanner(System.in);

        String nome = leteclado.nextLine();

        System.out.println("Olá "+ nome);
        leteclado.close();
    }
}
