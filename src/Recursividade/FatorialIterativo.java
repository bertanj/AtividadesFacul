package Recursividade;

public class FatorialIterativo {
    public static void main(String[] args) {
        int n = 5;
        int fatorial = 1;
        for (int i = n; i >= 1 ; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
