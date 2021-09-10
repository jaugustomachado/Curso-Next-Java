import java.util.Scanner;

//Programa que recebe o input de elementos de um vetor e retorna o maior e menor valor.
public class maxMinvetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior=0;
        int menor= 100;
        int [] arrInteiros = new int[5];

        for (int i=0; i<arrInteiros.length; i++){
            arrInteiros[i]= sc.nextInt();
        }
        for (int i=0; i<arrInteiros.length; i++){
            if (arrInteiros[i]>maior){
                maior=arrInteiros[i];
            }
            if (arrInteiros[i]<menor){
                menor=arrInteiros[i];
            }
        }
        System.out.println("maior = "+ maior +" "+ "menor= "+menor);
        sc.close();
    }

}
