package tests;

import models.Cliente;
import models.ContaCorrente;
import models.ContaPoupanca;
import enums.TipoConta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaOperationsTest {
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;
    private Cliente cliente;
    private final Long ID_CONTA_CORRENTE = 1L;
    private final Long ID_CONTA_POUPANCA = 2L;
    private final Long ID_CLIENTE = 1L;
    private final String AGENCIA = "0001";
    private final String NUMERO_CONTA_CORRENTE = "12345";
    private final String NUMERO_CONTA_POUPANCA = "12346";

    @BeforeEach
    void setUp() {
        cliente = new Cliente(
                ID_CLIENTE,
                "João da Silva",
                "joao@email.com",
                "senha123",
                "123.456.789-00",
                "11999999999",
                "Rua A",
                "Centro",
                "São Paulo",
                "SP",
                "00000-000",
                TipoConta.CORRENTE
        );

        contaCorrente = new ContaCorrente(ID_CONTA_CORRENTE, cliente.getId(), AGENCIA, 1000.0, NUMERO_CONTA_CORRENTE);
        contaPoupanca = new ContaPoupanca(ID_CONTA_POUPANCA, cliente.getId(), AGENCIA, 500.0, NUMERO_CONTA_POUPANCA);
    }

    @Test
    @DisplayName("Deve depositar na conta corrente corretamente")
    void deveDepositarContaCorrente() {
        contaCorrente.depositar(200.0);
        assertEquals(1200.0, contaCorrente.getSaldo(), 0.001);
    }

    @Test
    @DisplayName("Deve depositar na conta poupança corretamente")
    void deveDepositarContaPoupanca() {
        contaPoupanca.depositar(150.0);
        assertEquals(650.0, contaPoupanca.getSaldo(), 0.001);
    }

    @Test
    @DisplayName("Deve sacar valor da conta corrente corretamente")
    void deveSacarContaCorrente() {
        contaCorrente.sacar(300.0);
        assertEquals(700.0, contaCorrente.getSaldo(), 0.001);
    }

    @Test
    @DisplayName("Deve sacar valor da conta corrente com taxa")
    void deveSacarComTaxaContaCorrente() {
        contaCorrente.sacarComTaxa(100.0);
        assertEquals(890.0, contaCorrente.getSaldo(), 0.001);
    }

    @Test
    @DisplayName("Deve lançar exceção ao sacar sem saldo suficiente")
    void deveLancarExcecaoSaqueSemSaldo() {
        assertThrows(ArithmeticException.class, () -> contaCorrente.sacar(2000.0));
    }

    @Test
    @DisplayName("Deve transferir valor entre contas corretamente")
    void deveTransferirEntreContas() {
        contaCorrente.transferir(300.0, contaPoupanca);
        assertEquals(700.0, contaCorrente.getSaldo(), 0.001);
        assertEquals(800.0, contaPoupanca.getSaldo(), 0.001);
    }

    @Test
    @DisplayName("Deve lançar exceção ao transferir sem saldo suficiente")
    void deveLancarExcecaoTransferenciaSemSaldo() {
        assertThrows(ArithmeticException.class, () -> contaCorrente.transferir(2000.0, contaPoupanca));
    }
}
