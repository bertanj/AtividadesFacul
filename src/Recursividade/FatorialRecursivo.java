package Recursividade;

public class FatorialRecursivo {
    public static int fatorial(int num) {
        if(num == 0){
            return 1;
        }else {
            return fatorial(num - 1) * num;
        }
    }

    public static void main(String[] args) {
        System.out.println(fatorial(3));
    }
}
