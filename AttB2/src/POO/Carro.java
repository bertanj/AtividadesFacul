package POO;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tetoSolar;


    //Construtor
    public Carro(String marca, String cor, String modelo, int anoFabricacao, int numeroPortas, String tetoSolar){
        super(marca,cor,modelo,anoFabricacao);
        this.numeroPortas = numeroPortas;
        this.tetoSolar = tetoSolar;
    }

    //Metodo porta
    public int getNumeroPortas(){
        return this.numeroPortas;
    }

    public String getTetoSolar(){
        return this.tetoSolar;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Número de portas: " + this.numeroPortas + " Possui teto solar: "+ this.tetoSolar;
    }
}
