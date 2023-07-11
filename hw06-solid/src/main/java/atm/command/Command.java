package atm.command;

import atm.Cell;
import atm.cash.Banknote;
import lombok.SneakyThrows;

import java.util.List;

public interface Command {
    int executeCalcAndPrintBalance(List<Cell> cellList);

    @SneakyThrows
    boolean executeCalcAndPrintBalance(List<Cell> cellList, Banknote banknote, int count);

    List<Banknote> executeCalcAndPrintBalance(List<Cell> cellList, int sum);
}