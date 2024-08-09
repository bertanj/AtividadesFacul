package AttPoo;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String titular, double taxaJuros){
        super(titular);
        this.taxaJuros = taxaJuros;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if(valor>0){
            saldo += valor;
        }

    }

    @Override
    public void sacar(double valor) throws Exception {
        if(valor > saldo){
            throw new Exception("Saldo insuficiente para realizar o saque");
        } else if (valor < saldo) {
            saldo -= valor;
        }
    }

    public void aplicarJuros(){
        saldo *=  taxaJuros;
    }
}
