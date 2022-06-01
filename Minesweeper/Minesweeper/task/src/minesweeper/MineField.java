package minesweeper;

import java.util.*;
import java.util.stream.Collectors;

public class MineField {
    private int flagCounter = 0;
    private final int minesOnField;

    private final Cell[][] field = new Cell[9][9];
    private final Cell[] minedCells;

    {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = new Cell(j, i);
            }
        }
    }

    MineField(int minesOnField) {
        this.minesOnField = minesOnField;
        minedCells = new Cell[minesOnField];
    }

    void chargeMines(int avoidX, int avoidY) {
        int mineCounter = 0;
        Random rand = new Random();

        while (mineCounter < minesOnField) {
            int x = rand.nextInt(field.length);
            int y = rand.nextInt(field.length);

            if (field[y][x].isMined() || x == avoidX && y == avoidY) {
                continue;
            }

            field[y][x].setMine();
            minedCells[mineCounter] = field[y][x];
            mineCounter++;
        }
    }

    void putFlagOnCell(int x, int y) {
        if (field[x][y].isNumbered() && field[x][y].isDiscovered()) {
            System.out.println("There is number here!");
            return;
        }

        flagCounter = field[x][y].isFlag() ? flagCounter - 1 : flagCounter + 1;

        field[x][y].setMark();
    }

    GameStatus countFlags(GameStatus status) {
        for (Cell c : minedCells) {
            if (c == null || !c.isFlag()) {
                return status;
            }
        }

        if (flagCounter == minesOnField) {
            return GameStatus.WIN;
        }

        return status;
    }


    void scanMinesAround() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                int adjacentMines = scanAdjacentCells(i, j);

                if (adjacentMines > 0) {
                    field[i][j].setNumber(adjacentMines);
                }
            }
        }
    }

    private int scanAdjacentCells(int x, int y) {
        Cell adjacentCell;
        int mineCount = 0;

        if (field[x][y].isMined()) {
            return mineCount;
        }

        for (int i = x - 1; i <= x + 1 ; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                try {
                    adjacentCell = field[i][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
                if (adjacentCell.isMined()) {
                    mineCount++;
                }
            }
        }

        return mineCount;
    }

    GameStatus discoverCell(int x, int y, GameStatus status) {

        if (field[x][y].isMined()) {
            fieldReveal();
            return GameStatus.BLOWUP;
        }

        floodFill(x, y);

        return status;
    }

    void floodFill(int x, int y) {
        Queue<Cell> queue = new ArrayDeque<>();
        queue.offer(field[x][y]);

        while (!queue.isEmpty()) {
            Cell currentCell = queue.poll();
            currentCell.setDiscovered();

            if (currentCell.isNumbered()) {
                continue;
            }

            for (int i = currentCell.y - 1; i <= currentCell.y + 1 ; i++) {
                for (int j = currentCell.x - 1; j <= currentCell.x + 1; j++) {
                    try {
                        if (field[i][j].isDiscovered()) {
                            continue;
                        }
                        queue.offer(field[i][j]);
                    } catch (ArrayIndexOutOfBoundsException ignored) {
                    }
                }
            }
        }
    }


    void printField() {
        System.out.println(" |123456789|");
        System.out.println("-|---------|");
        for (int i = 0; i < field.length; i++) {
            System.out.printf("%d|%s|\n", i + 1, Arrays.stream(field[i])
                    .map(Cell::toString)
                    .collect(Collectors.joining()));
        }
        System.out.println("-|---------|");
    }

    void fieldReveal() {
        for (Cell[] arr : field) {
            for (Cell c : arr) {
                c.setDiscovered();
            }
        }
    }
}
