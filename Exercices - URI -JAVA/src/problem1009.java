import java.util.Scanner;

public class problem1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double sells = sc.nextDouble();

        salary=salary+(sells*0.15);

        System.out.printf("TOTAL = R$ %.2f\n",salary);
        sc.close();

    }
}
