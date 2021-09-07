import java.util.Scanner;

public class problem1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] vetorOpcao = new String [3];
        for(int i=0; i <3; i++){
            vetorOpcao[i]= sc.next().toLowerCase();
        }
        if (vetorOpcao[0].equals("vertebrado")){
            if(vetorOpcao[1].equals("ave")){
                if (vetorOpcao[2].equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if( vetorOpcao[2].equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(vetorOpcao[1].equals("inseto")){
                if(vetorOpcao[2].equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(vetorOpcao[2].equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
        sc.close();
    }
}
