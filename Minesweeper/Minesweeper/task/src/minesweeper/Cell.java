package minesweeper;

public class Cell {
    int x;
    int y;

    private String symbol = "/";
    private boolean mined = false;
    private boolean flag = false;
    private boolean numbered = false;
    private boolean discovered = false;

    Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean isNumbered() {
        return numbered;
    }

    void setNumber(int number) {
        symbol = String.valueOf(number);
        numbered = true;
    }

    boolean isDiscovered() {
        return discovered;
    }

    void setDiscovered() {
        discovered = true;
    }

    void setMine() {
        mined = true;
        symbol = "X";
    }

    boolean isMined() {
        return mined;
    }
    boolean isFlag() {
        return flag;
    }

    void setMark() {
        flag = !flag;
    }

    @Override
    public String toString() {

        return isDiscovered() ? symbol :
                   isFlag() ? "*" : ".";
    }
}
