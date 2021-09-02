//Programa que imprime apenas os números pares de um vetor já definido.

public class imprimirNumPares {
    public static void main(String[] args) {
    
        int vetor [] = {12,28,37,49,58};

        for (int v: vetor){;
            if (v%2 ==0 ){
                System.out.println(v);
            }
        }
    }
}
