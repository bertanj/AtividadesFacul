//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Conjuntos {

    public static void main(String[] args) {
        int [] vet1 = {1,2,3,4,5};
        int [] vet2 = {0,2,4,6,8};
        Integer [] intersec = new Integer[vet1.length];
        int [] uniao = new int [9];
        int contador = 0;
        int aux = 0;


        //Intersecção de um conjunto
        System.out.println("Intersecção de um conjunto:");
        for (int i = 0; i < vet1.length; i++) {
            for (int j = 0; j < vet1.length; j++) {
                if(vet1[i] == vet2[j]) {
                    intersec[i] = vet1[i];
                    contador++;
                }
            }
        }
        for (int i = 0; i < intersec.length; i++) {
            System.out.println(intersec[i]);
        }
        System.out.println("Nesse conjunto há "+ contador+ " números iguais.");

        //União de um conjunto
        System.out.println("União de um conjunto:");
        for (int i = 0; i < vet1.length; i++) {
            uniao[i] = vet1[i];
        }
        for (int i = 4; i < uniao.length ; i++) {
           uniao[i] = vet2[aux];
           aux++;
        }
        for (int i = 0; i < uniao.length; i++) {
            System.out.println(uniao[i]);
        }
        //Não consegui remover os números que estão aparecendo repetidas vezes, mas me esforcei para criar esse código hahaha

    }
}