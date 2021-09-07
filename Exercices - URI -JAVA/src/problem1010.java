import java.util.Scanner;

public class problem1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int units = sc.nextInt();
        double price = sc.nextDouble();

        int code2 = sc.nextInt();
        int units2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double total=(units*price) +(units2*price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
        sc.close();




    }
}
