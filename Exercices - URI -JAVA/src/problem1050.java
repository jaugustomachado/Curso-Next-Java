import java.util.Scanner;

public class problem1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] ddd = {61,71,11,21,32,19,27,31};
        String [] cidade = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
        int numero = sc.nextInt();

        boolean teste = false;
        int indice=0;
        
        for (int i=0;i<ddd.length;i++){
            if (numero==ddd[i]){
                teste=true;
                indice=i;
            }
        }
        if (teste==true){
            System.out.println(cidade[indice]);
        }else{
            System.out.println("DDD nao cadastrado");
        }
        sc.close();
    }
}
