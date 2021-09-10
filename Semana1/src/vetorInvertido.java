public class exercicio {
    public static void main(String[] args) {

        int[] arrInteiros = {1,2,3,4,5,6,7,8,9,10};
        int[] arrInverso = new int[10];

        for (int i=0; i<arrInteiros.length; i++){
            int posicao = arrInteiros.length-i-1;
            
            arrInverso[posicao]=arrInteiros[i];
        }
        for (int j=0; j< arrInverso.length;j++){
            
            System.out.println(arrInverso[j]);
        }
    }
}
