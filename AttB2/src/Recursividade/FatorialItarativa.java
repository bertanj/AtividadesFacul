package Recursividade;

public class FatorialItarativa {
    public static int  fatorialIterativa(int n){
        int soma = 0;
        for (int i = n; i >= 0; i--){
            soma = n * (n-1);
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println(fatorialIterativa(4));
    }
}
