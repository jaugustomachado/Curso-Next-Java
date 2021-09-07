import java.util.Scanner;

public class problem1170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dias =0;
        

        for(int i =0;i<N;i++){
            double supply=sc.nextDouble();
            while (supply>1){
                supply =supply/2;
                dias+=1;
            }
            System.out.println(dias+" dias");
            dias=0;
        }
        sc.close();

    }
}
