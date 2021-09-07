import java.util.Scanner;

public class problem1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (Math.abs(b-c) < a && a< b + c && Math.abs(a-c) < b && b< a + c && Math.abs(a-b) < c && c< a + b){
            System.out.printf("Perimetro = %.1f\n",a+b+c);
        }else{
            System.out.printf("Area = %.1f\n",((a+b)*c)/2);
        }
        sc.close();
    }
}
