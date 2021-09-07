import java.util.Scanner;

public class problem1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, hours;
        double tax, salary;

        number = sc.nextInt();
        hours = sc.nextInt();
        tax= sc.nextDouble();

        salary = hours*tax;

        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n",salary);
        sc.close();
    }
}
