package POO;

public class MainVeiculo {

    public static void main(String[] args) {
        //Criando objetos
        Veiculo veiculo1 = new Veiculo(" Toyota", " Cinza", " Corolla",  2022);
        Veiculo veiculo2 = new Veiculo(" Ford", " Azul", " Ka", 2015);
        Veiculo veiculo3 = new Veiculo(" Honda", " Preto", " Civic", 2024);

        //Metodos para definir velocidade
        veiculo1.acelerar(150);
        veiculo2.acelerar(120);
        veiculo3.acelerar(220);

        System.out.println(veiculo1.getDescricao());
        System.out.println(veiculo2.getDescricao());
        System.out.println(veiculo3.getDescricao());

        veiculo1.frear(50);
        veiculo2.frear(60);
        veiculo3.frear(20);

        System.out.println(veiculo1.getDescricao());
        System.out.println(veiculo2.getDescricao());
        System.out.println(veiculo3.getDescricao());


    }
}
