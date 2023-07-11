package atm.command;

import atm.Cell;
import atm.cash.Banknote;

import java.util.List;

public class DepositCommand implements Command {

    @Override
    public int executeCalcAndPrintBalance(List<Cell> cellList) {
        return 0;
    }

    @Override
    public boolean executeCalcAndPrintBalance(List<Cell> cellList, Banknote banknote, int count) {
        int i;
        boolean result = false;
        boolean isnominalfound = false;

        for (i = 0; i < cellList.size(); i++) {
            if (cellList.get(i).getBanknote().getValue() == banknote.getValue()) {
                cellList.get(i).checkAndChangeCountBills(count);
                isnominalfound = true;
                result = true;
            }
        };

        if (!isnominalfound) {
            cellList.add(new Cell(banknote, count));
            result = true;
        };

        if (result = false) {
            System.out.println("Операция не может быть выполнена");
        };


        return result;
    }

    @Override
    public List<Banknote> executeCalcAndPrintBalance(List<Cell> cellList, int amount) {
        return null;
    }
}