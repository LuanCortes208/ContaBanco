package models;

public final class ContaCorrente extends Conta{

    private static final short taxaSaque = 10;

    public ContaCorrente(Long id, long user_id, String agencia, double saldo, String numero) {
        super(id, user_id, agencia, saldo, numero);
    }

    public void sacarComTaxa(double valor) {
        sacar(valor + taxaSaque);
    }
}
