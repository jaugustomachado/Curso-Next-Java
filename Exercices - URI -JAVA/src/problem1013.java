import java.util.Scanner;

public class problem1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = (a+b+Math.abs((a-b)))/2;
        if (maior==a){
            maior= (a+c+Math.abs((a-c)))/2;
        }else{
            maior= (b+c+Math.abs((b-c)))/2;
        }
        System.out.println(maior+" eh o maior");
        sc.close();
    }
}
