import java.util.Scanner;

public class problem1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextFloat();
        double b = sc.nextFloat();

        a=a *3.5;
        b=b *7.5;
        
        double media = (a+b)/11;

        System.out.printf("MEDIA = %.5f\n",media);
        sc.close();

    }
}
