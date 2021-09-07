import java.util.Scanner;

public class problem1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b,2)- 4*a*c;
        if (delta <0 || a==0){
            System.out.println("Impossivel calcular");
        }else{
            double R1=(-b+Math.pow(delta,0.5))/(2*a);
            double R2=(-b-Math.pow(delta,0.5))/(2*a);
            System.out.printf("R1 = %.5f\n",R1);
            System.out.printf("R2 = %.5f\n",R2);
        }
        sc.close();
    }
}
