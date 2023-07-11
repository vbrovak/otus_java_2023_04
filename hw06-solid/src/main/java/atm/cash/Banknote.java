package atm.cash;

public enum Banknote {
    N100(100),
    N200(200),
    N500(500),
    N1000(1000),
    N2000(2000),
    N5000(5000),
    WRONG(123);

    @lombok.Getter
    private int value;

    Banknote(int value) {
        this.value = value;
    }
}
