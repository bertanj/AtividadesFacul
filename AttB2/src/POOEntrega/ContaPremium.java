package POOEntrega;

public class ContaPremium extends ContaAtt {

    public ContaPremium(String titular) {
        super(titular);
        setSaldo(500);
    }

    @Override
    public void depositar(double valor) {
        if (valor>0){
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor){
        if (saldo<valor){
            System.out.println("Impossível realizar saque, valor excede o saldo disponivel");
        }else{
            saldo -= valor;
        }
    }
}
