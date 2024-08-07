package POOEntrega;

public class ContaBasicaAtt extends ContaAtt {


    public ContaBasicaAtt(String titular) {
        super(titular);
    }

    @Override
    public void depositar(double valor) {
        if (valor >0){
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor){
        if(saldo > valor){
            saldo -= valor;
        }
    }
}
