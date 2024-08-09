package Recursividade;

public class VetorRecursivo {
    public static void vetorRecursivo(int []vetor, int indice){
        if(indice == vetor.length){
           return;
        }
        System.out.println(vetor[indice]);
        vetorRecursivo(vetor, indice + 1);
    }
    public static void main(String[] args) {
        int []vetor = new int[3];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        vetorRecursivo(vetor, 0);
    }
}
