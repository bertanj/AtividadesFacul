package AttPooEntrega;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho da biblioteca:");
        int tamanho = sc.nextInt();
        int opc;

        Biblioteca b = new Biblioteca(tamanho);


        do{
            System.out.println("Escolha uma opcao: ");
            System.out.println("1-adicionar Livro");
            System.out.println("2-remover Livro");
            System.out.println("3-buscar Livro");
            System.out.println("4-listar Livros");
            System.out.println("5-contar Livros");
            System.out.println("0-Sair");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    Biblioteca.adicionarLivro();
                    break;
                case 2:
                    Biblioteca.removerLivro();
                    break;
                case 3:
                    Biblioteca.buscarLivro();
                    break;
                case 4:
                    Biblioteca.listarLivro();
                    break;
                case 5:
                    Biblioteca.contarLivro();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        }while(opc != 0);


    }
}
