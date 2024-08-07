package POOEntrega;

import java.util.Scanner;

public class MainContaAtt {

    public static void main(String[] args) {
        ContaAtt cB = new ContaBasicaAtt("Mateus");
        ContaAtt cP = new ContaPremium("Ana");

        Scanner scanner = new Scanner(System.in);

        int option;
        double valor;

        do {
            System.out.println("1-Depositar conta básica");
            System.out.println("2-Sacar conta básica");
            System.out.println("3-Transferir da conta básica para premium");
            System.out.println("4-Depositar na conta premium");
            System.out.println("5-Sacar da conta premium");
            System.out.println("6-Transferir da conta premium para conta básica");
            System.out.println("7-Mostrar saldo");
            System.out.println("8-Sair");
            System.out.print("\nSelecione uma opção do menu:");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("valor que deseja depositar:");
                    valor = scanner.nextDouble();
                    cB.depositar(valor);
                    break;

                case 2:
                    System.out.println("");
            }

        }while(option > 8 || option < 1);



    }
}
