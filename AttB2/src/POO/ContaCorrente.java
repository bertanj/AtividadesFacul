package POO;

public class ContaCorrente extends Conta {
    public ContaCorrente(String titular){
        super(titular);
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
}
