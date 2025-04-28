package models;

import java.time.LocalDate;

public final class ContaPoupanca extends Conta{
    LocalDate data_criacao;
    private static final double TAXA_MENSAL = 0.005;
    private static final double taxa_diaria = Math.pow(1 + TAXA_MENSAL, 1.0/30) - 1;

    public ContaPoupanca(Long id, long user_id, String agencia, double saldo, String numero) {
        super(id, user_id, agencia, saldo, numero);
        this.data_criacao = LocalDate.now();
    }

    public double calcularRendimento() {return getSaldo() * taxa_diaria;}

    public void aplicarRendimento() {
        LocalDate hoje = LocalDate.now();
        if (LocalDate.now().getDayOfWeek().getValue() <= 5 && dia_De_Aniversario(hoje)){
            double rendimento = calcularRendimento();
            if(rendimento > 0){depositar(rendimento);}
        }
    }

    public boolean dia_De_Aniversario(LocalDate hoje) {
        int dia = Math.min(data_criacao.getDayOfMonth(), hoje.lengthOfMonth());
        return hoje.getDayOfMonth() == dia;
    }
}
