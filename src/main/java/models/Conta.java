package models;

public sealed abstract class Conta permits ContaCorrente, ContaPoupanca{
    private final Long id;
    private final long user_id;
    private String agency;
    private double saldo;
    private String numero;

    public Conta(Long id, long user_id, String agencia, double saldo, String numero) {
        this.id = id;
        this.user_id = user_id;
        this.agency = agencia;
        this.saldo = saldo;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public long getUser_id() {
        return user_id;
    }

    public String getAgency() {
        return agency;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void sacar(double valor) {
        if (valor > this.getSaldo()) {throw new ArithmeticException("Saldo insuficiente");}
        saldo -= valor;
    }

    public void depositar(double valor) {saldo += valor;}

    public void transferir(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);
    }


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Conta conta)) return false;

        return user_id == conta.user_id && id.equals(conta.id);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + Long.hashCode(user_id);
        return result;
    }
}
