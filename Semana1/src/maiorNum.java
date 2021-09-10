// Programa que calcular o maior número de cada metade de um vetor previamente estipulado.

public class maiorNum {
    public static void main(String[] args) {
        
        int [] arr10={1,2,3,4,5,6,7,8,9,10};

        int maior = arr10[0];

        for (int i =1; i<arr10.length/2;i++){
            if(maior<arr10[i]){
                maior=arr10[i];
            }
        }
        System.out.println("metade um -> maior número: "+ maior);
        
        maior= arr10[5];
        for (int i =6; i<arr10.length;i++){
            if(maior<arr10[i]){
                maior=arr10[i];
            }
        }
        System.out.println("metade dois -> maior numero: "+ maior);
    }
}
