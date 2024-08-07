package Recursividade;

public class FibonacciIterativa {
    public static int fibonacciIterative(int num) {
        int n0 = 0;
        int n1 = 1;
        int soma = 0;
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            for (int i = 2; i <= num; i++) {
                soma = n0 + n1;
                n0 = n1;
                n1 = soma;
            }
        }
        return soma;
    }

    public static void main(String[] args) {

        System.out.println(fibonacciIterative(8));
    }
}
