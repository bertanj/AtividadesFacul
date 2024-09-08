package AttPooEntrega;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private static Livro[] livros;
    private static int contador = 0;

    //metodos
    public Biblioteca(int tamanho) {
        livros = new Livro[tamanho];
    }

    public static void adicionarLivro () {
        Scanner sc = new Scanner(System.in);
        if (contador < livros.length) {
            System.out.println("Digite o nome do livro: ");
            String nome = sc.nextLine();
            System.out.println("Digite o autor do livro: ");
            String autor = sc.nextLine();
            System.out.println("Digite o total de paginas do livro: ");
            int paginas = sc.nextInt();

            livros[contador] = new Livro(nome, autor, paginas);

            System.out.println("Livro adicionado com sucesso!");
            contador++;
        }else{
            System.out.println("Não foi possivel adicionar um livro!");
        }
    }

    public static void removerLivro () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        String nome = sc.nextLine();
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equals(nome)) {
                livros[i] = null;
                System.out.println("Livro removido com sucesso!");
                contador--;
                return;
            }else{
                System.out.println("Não foi encontrado o livro informado!");
                return;
            }
        }
    }

    public static void buscarLivro () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do livro:");
        String nome = sc.nextLine();

        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equals(nome)) {
                System.out.println(livros[i]);
                return;
            }
        }
    }

    public static void listarLivro () {
        for (int i = 0; i < contador; i++) {
            System.out.println(livros[i]);
        }
    }

    public static void contarLivro () {
        System.out.println("Total de livros no acervo: " + contador);
    }

}


