import java.util.Scanner;

public class problem1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int leds=0;
    
        for (int i =0; i<N ; i++){
            String numero=sc.next();
            for(int j =0;j<numero.length();j++){
                switch (numero.charAt(j)){
                    case '0':
                        leds=leds+6;
                        break;
                    case '1':
                        leds=leds+2;
                        break;
                    case '2':
                        leds=leds+5;
                        break;
                    case '3':
                        leds=leds+5;
                        break;
                    case '4':
                        leds=leds+4;
                        break;
                    case '5':
                        leds=leds+5;
                        break;
                    case '6':
                        leds=leds+6;
                        break;
                    case '7':
                        leds=leds+3;
                        break;
                    case '8':
                        leds=leds+7;
                        break;
                    case '9':
                        leds=leds+6;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(leds+" leds");
            leds=0;
        }  
        sc.close();     
    }
}