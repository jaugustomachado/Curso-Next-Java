import java.util.Scanner;

public class problem1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double med = ((a*2)+(b*3)+(c*5))/10;

        System.out.printf("MEDIA = %.1f\n",med);

        sc.close();
    }
}
