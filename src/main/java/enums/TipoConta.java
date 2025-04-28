package enums;

public enum TipoConta {
    CORRENTE((short) 0),
    POUPANCA((short) 1);

    private final short cod;

    TipoConta(short cod) {
        this.cod = (cod);
    }
}
