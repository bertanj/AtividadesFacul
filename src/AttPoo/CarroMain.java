package AttPoo;

public class CarroMain {
    public static void main(String[] args) {
        //Vamos criar os objetos da classe CARRO
        Carro carro1 = new Carro("Ford","Azul", "Fusion", 2024, 100);
        Carro carro2 = new Carro("Honda", "preto", "Civic", 2014,80);
        Carro carro3 = new Carro("Toyota", "Amarelo", "Supra", 2001,70);

        //Vamos utilizar os métodos contruídos para definir a velocidade
        carro1.acelerar(150);
        carro2.acelerar(110);
        carro3.acelerar(250);

        System.out.println(carro1.getDescricao());
        System.out.println(carro2.getDescricao());
        System.out.println(carro3.getDescricao());

        carro1.frear(90);
        carro2.frear(60);
        carro3.frear(150);

        System.out.println(carro1.getDescricao());
        System.out.println(carro2.getDescricao());
        System.out.println(carro3.getDescricao());

        carro1.consumoMedio();
        carro1.manutencao();
        carro1.viagem(5,100);
    }

}
