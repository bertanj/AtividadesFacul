package Recursividade;

import java.util.Scanner;

    public class MatrizRecursiva {
        public static void matrizRecursiva(int [][]matriz, int indiceLinha, int indiceColuna){
             if (indiceColuna == matriz[0].length) { //Quando chega ao limite máximo da coluna ele entra nessa condição e reinicia o indiceColuna e pula de linha
                indiceColuna=0;//Reiniciando a contagem do indice da coluna
                indiceLinha++;//Acrescentando 1 no indice linha para pular de linha
                System.out.println();//Pulando de linha para ficar no formato da matriz
            }
            if(indiceLinha == matriz.length) { //Condição de parada
                 return;
            }

            System.out.print(matriz[indiceLinha][indiceColuna]); //Printando os valores na tela
            matrizRecursiva(matriz, indiceLinha, indiceColuna+1); //Chamada do método para acrescentar o indice coluna e percorrer todos os valores da coluna|
        }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]matriz = new int[4][1];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        matrizRecursiva(matriz, 0, 0);

    }
}

 /*  antes estava fazendo assim e ficava em um looping infinito

 public static void matrizRecursiva(int [][]matriz, int indiceLinha, int indiceColuna){
            //Condição de parada da matriz. Se a linha e a coluna igualarem o tamanho final da linha e coluna da matriz
            if(indiceLinha == matriz.length ){
                return;
            } else if (indiceColuna == matriz[0].length) {
                return; //Quando entra nesse return o código pula a chamada do primeiro metodo, passa pelo sout de pular linha, zera o indice coluna e chama o metodo com o outro parametro para pular a linha e contar exibir as colunas novamente
            }

            System.out.print(matriz[indiceLinha][indiceColuna]);
            matrizRecursiva(matriz, indiceLinha, indiceColuna+1);
            System.out.println();

            indiceColuna=0;//Reiniciando a contagem do indice da coluna
            indiceLinha++;//Acrescentando 1 no indice linha para pular de linha

            matrizRecursiva(matriz, indiceLinha, indiceColuna);

        } */
