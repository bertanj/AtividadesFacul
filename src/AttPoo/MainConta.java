package AttPoo;

public class MainConta {
    public static void main(String[] args) {
        Conta minhaContaCorrente = new ContaCorrente("Mateus");
        Conta minhaContaPoupanca = new ContaPoupanca("Mateus", 0.15);

        try {
            minhaContaCorrente.depositar(1000.00);
            System.out.println("Saldo após depósito CC: "+ minhaContaCorrente.getSaldo());

            minhaContaCorrente.sacar(500.00);
            System.out.println("Saldo após saque na CC: "+ minhaContaCorrente.getSaldo());

            minhaContaCorrente.sacar(600.00);
            System.out.println("Saldo após saque na CC: "+ minhaContaCorrente.getSaldo());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Operações concluídas...");
        }

        try{
            minhaContaPoupanca.depositar(2000);
            System.out.println("Saldo após deposito CP: "+ minhaContaPoupanca.getSaldo());

            ((ContaPoupanca) minhaContaPoupanca).aplicarJuros();
            System.out.println("Saldo após juros aplicado" + minhaContaPoupanca.getSaldo());
        }finally {
            System.out.println("Operações realizadas...");
        }
    }
}
