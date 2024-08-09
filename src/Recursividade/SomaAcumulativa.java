package Recursividade;

import java.util.Scanner;

public class SomaAcumulativa{

    public static int somaAcumulativaIterativa(int numero) {
        int soma = 0;
        for (int i = 0; i <= numero ; i++) {
            soma = soma + i;
            //soma += i;
        }

        return soma;
    }

    public static int somaAcumulativaRecursiva(int numero) { // 0

        // condição base
        if(numero == 0) {
            return numero;
        }
        //processamento


        return somaAcumulativaRecursiva(numero-1) + numero;
    }

    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Por favor, informe um número natural para a realização da soma acumulativa até 0.");
            numero = scanner.nextInt();
        } while (numero < 0);
        System.out.println(somaAcumulativaRecursiva(numero));

    }
}