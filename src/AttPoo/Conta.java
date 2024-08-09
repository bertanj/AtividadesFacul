package AttPoo;

public abstract class Conta {
    protected String titular;
    protected double saldo;


    public Conta(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public abstract void depositar(double valor);

    public abstract void sacar(double valor) throws Exception;
}
