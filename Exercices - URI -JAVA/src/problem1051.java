import java.util.Scanner;

public class problem1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        double tax = 0;

        if (salary<=2000.00){
            System.out.println("Isento");
        }else if(salary>2000.00 && salary<=3000.00){
            tax=(salary-2000.00)*0.08;
            System.out.printf("R$ %.2f\n",tax);
        }else if(salary>3000.00 && salary<=4500.00){
            tax=((salary-3000.00)*0.18)+(1000.00*0.08);
            System.out.printf("R$ %.2f\n",tax);
        }else if(salary>4500.00){
            tax=((salary-4500.00)*0.28)+(1500*0.18)+(1000*0.08);
            System.out.printf("R$ %.2f\n",tax);
        }
        sc.close();
    }
}
