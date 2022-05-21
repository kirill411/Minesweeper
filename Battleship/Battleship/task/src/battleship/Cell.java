package battleship;

class Cell {
    private String mark;
    Ship ship;
    private boolean occupied = false;

    public Cell() {
        mark = "~";
    }

    void markShip(Ship ship) {
        mark = "O";
        this.ship = ship;
        occupied = true;
    }

    boolean hit() {
        if("O".equals(mark)) {
            ship.getHit();
        }
        if ("O".equals(mark) || "X".equals(mark)) {
            mark = "X";
            return true;
        }
        mark = "M";
        return false;
    }

    boolean isOccupied(){
        return occupied;
    }

    @Override
    public String toString() {
        return mark;
    }
}
