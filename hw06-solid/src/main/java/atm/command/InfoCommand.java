package atm.command;

import atm.Cell;
import atm.cash.Banknote;

import java.util.List;

public class InfoCommand implements Command {
    @Override
    public int executeCalcAndPrintBalance(List<Cell> cellList) {
        var sum = 0;
        for (Cell cell : cellList) {
            sum += (cell.getCountBill() * cell.getBanknote().getValue());
        }
        System.out.println("Balance: " + sum);
        return sum;
    }

    @Override
    public boolean executeCalcAndPrintBalance(List<Cell> cellList, Banknote banknote, int count) {
        return false;
    }

    @Override
    public List<Banknote> executeCalcAndPrintBalance(List<Cell> cellList, int amount) {
        return null;
    }
}