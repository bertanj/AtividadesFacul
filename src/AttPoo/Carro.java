package AttPoo;

import java.util.Scanner;

public class Carro {
    //Atributos
    private String marca;
    private String cor;
    private String modelo;
    private int ano_fabricacao;
    private double velocidade;
    private int combustivel;



    //Construtores
    public Carro(String marca, String cor, String modelo, int ano_fabricacao, int combustivel){
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        this.velocidade = 0;
        this.combustivel = combustivel;
    }

    //Métodos
    public void acelerar(double incremento){
        this.velocidade += incremento;
    }

    public void frear(double decremento){
        this.velocidade -= decremento;
    }

    public void manutencao(){
        String confirm;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja realizar o manutencao do carro?(s/n)");
        confirm = scanner.next();

        if(confirm.equals("s")){
            System.out.println("Realizando troca de óleo e verificando freio...");
            System.out.println("Manutenção realizada com sucesso!");
        }else{
            System.out.println("Nenhuma manutenção realizada.");
        }
    }

    public void consumoMedio(){
        int km;
        int litro;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade de quilometros percorrido?");
        km = scanner.nextInt();
        System.out.println("Qual a quantidade de litros de gasolina consumido?");
        litro = scanner.nextInt();

        result = (km/litro);

        System.out.println("Consumo médio de combustível por quilômetro: "+ result+ "km/l");

    }

    public void viagem(double mediaLitro, int tanque){
        int km;
        double gasto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual distância(KM) irá percorrer na viagem?");
        km = scanner.nextInt();
        gasto = km/mediaLitro;
        System.out.println("A quantidade de combustivel consumido será de "+ gasto+ "l");

        if(tanque - gasto < 0){
            System.out.println("Seu gasto ("+gasto+"l) será maior do que a quantidade que há em seu tanque ("+tanque+"l). Será necessário abastecer o veículo durante a viagem!");
        }else{
            System.out.println("Calculando com seu gasto ("+gasto+"l) irá sobrar "+ (tanque-gasto) +"l em seu tanque.");
        }
    }

    public String getDescricao(){
        return "Marca:" + this.marca + "Cor:" + this.cor + "Modelo:" + this.modelo + "Ano de Fabricação:" + this.ano_fabricacao + "Velocidade:" +this.velocidade;
    }

}

