package AttPooEntrega;

public class ContaPremium extends ContaAtt {

    public ContaPremium(String titular) {
        super(titular);
        setSaldo(500);
    }

    @Override
    public void depositar(double valor) {
        if (valor>0){
            this.setSaldo(this.getSaldo()+ valor);
            System.out.println("Depositado com sucesso!");
        }else{
            System.out.println("Valor de depósito inválido");
        }
    }

    @Override
    public void sacar(double valor){
        if (saldo<valor){
            System.out.println("Impossível realizar saque, valor excede o saldo disponivel");
        }else{
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Saque realizado com sucesso");
        }
    }

    @Override
    public void transferir(double valor, ContaAtt destinatario) {
        if (valor > 0){
            destinatario.depositar(valor);
            setSaldo(this.getSaldo()-valor);
            System.out.println("Tranferencia realizada com sucesso");
        }
    }


    public void transferirSaldoContaPremium(double valor) {
        if (saldo<valor){
            System.out.println("Impossível realizar transferencia, valor excede o saldo disponivel");
        }else{
            this.setSaldo(this.getSaldo()-valor);
            contaBasica.setSaldo(contaBasica.getSaldo()+valor);
        }

    }
}
