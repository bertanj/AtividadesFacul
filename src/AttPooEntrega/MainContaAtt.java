package AttPooEntrega;

import java.util.Scanner;

public class MainContaAtt {

    public static void main(String[] args) {
        ContaBasicaAtt cB = new ContaBasicaAtt("Mateus");
        ContaPremium cP = new ContaPremium("Ana");

        Scanner scanner = new Scanner(System.in);

        int option;


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
                    double depositoCB = scanner.nextDouble();
                    cB.depositar(depositoCB);
                    break;

                case 2:
                    System.out.println("valor que deseja sacar:");
                    double saqueCB = scanner.nextDouble();
                    cB.sacar(saqueCB);
                    break;

                case 3:
                    System.out.println("valor que deseja transferir para conta premium:");
                    double valorTransferenciaCP = scanner.nextDouble();
                    cB.transferir(valorTransferenciaCP, cP);
                    break;

                    case 4:
                        System.out.println("valor que deseja depositar:");
                        double depositoCP = scanner.nextDouble();
                        cP.depositar(depositoCP);
                        break;

                    case 5:
                        System.out.println("valor que deseja sacar:");
                        double saqueCP = scanner.nextDouble();
                        cP.sacar(saqueCP);
                        break;

                    case 6:
                        System.out.println("valor que deseja transferir para conta básica:");
                        double transferenciaCB = scanner.nextDouble();
                        cP.transferir(transferenciaCB, cB);
                        break;

                    case 7:
                        System.out.println("Saldo conta básica: "+ cB.getSaldo()+ "\n Saldo conta premium: "+ cP.getSaldo()+ "\n");
                        break;

                    case 8:
                        System.out.println("Saindo...");
                        break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }while(option != 8);



    }
}
