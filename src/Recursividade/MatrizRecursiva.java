package Recursividade;

import java.util.Scanner;

public class MatrizRecursiva {
    public static void matrizRecursiva(int [][]matriz, int indiceLinha, int indiceColuna){
        //Condição de parada da matriz. Se a linha e a coluna forem igual ao tamanho final da linha e coluna da matriz
        if(indiceLinha == matriz.length ){
            return;
        } else if (indiceColuna == matriz[0].length + indiceColuna) {
            return;
        }
        System.out.println(matriz[indiceLinha][indiceColuna]);
        matrizRecursiva(matriz, indiceLinha , indiceColuna+1);
    }


   /* public static int matrizRecursiva(int [][]matriz, int indiceLinha, int indiceColuna){
        if (indiceColuna == matriz.length){
            return matriz[indiceLinha][indiceColuna];
        }else if (indiceLinha == matriz.length-1){
            return matriz[indiceLinha][indiceColuna];
        }
        return matrizRecursiva(matriz, indiceLinha, indiceColuna+1);
    }

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        /*for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }*/

        matrizRecursiva(matriz, 0, 0);

    }
}
