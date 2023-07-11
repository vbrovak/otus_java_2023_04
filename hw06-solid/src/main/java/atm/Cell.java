package atm;

import atm.cash.Banknote;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cell {
    @lombok.Getter
    private final Banknote banknote;
    private int countBill;

    public int getCountBill() {
        return countBill;
    }

    public void checkAndChangeCountBills(int countBill) {
        if (countBill > 0) {
            this.countBill += countBill;
        } else {
            System.out.println("Количество купюр должно быть > 0");
        }
        ;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "banknote=" + banknote +
                ", count=" + countBill +
                '}';
    }
}
