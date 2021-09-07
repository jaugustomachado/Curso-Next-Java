import java.util.Scanner;

public class problem1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testes = sc.nextInt();
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        String a = "C";
        String b = "R";
        String c = "S";

        for(int i =0; i<=testes-1; i++){

            int qte =sc.nextInt();
            String animal =sc.next();

            if (animal.equals(a)){
                coelhos = coelhos +qte;
            }
            else if (animal.equals(b)){
                ratos = ratos + qte;
            }
            else if (animal.equals(c)){
                sapos = sapos + qte;
            }
        }
        int TOTAL = coelhos+ratos+sapos;
        double total=coelhos+ratos+sapos;
        double porc1=100*(coelhos/total);
        double porc2=100*(ratos/total);
        double porc3=100*(sapos/total);
        System.out.println("Total: "+TOTAL+" cobaias");
        System.out.println("Total de coelhos: "+coelhos);
        System.out.println("Total de ratos: "+ratos);
        System.out.println("Total de sapos: "+sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", porc1);
        System.out.printf("Percentual de ratos: %.2f %%\n", porc2);
        System.out.printf("Percentual de sapos: %.2f %%\n", porc3);
        sc.close();
    }
}
