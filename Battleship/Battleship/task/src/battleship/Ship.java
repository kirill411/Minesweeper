package battleship;

import java.util.List;

class Ship {

    private final String name;
    private final int size;
    private int hits;
    boolean sank = false;

    private Ship(String name, int size) {
        this.name = name;
        this.size = size;
        hits = 0;
    }

    public int getSize() {
        return size;
    }

    void getHit() {
        if (size > hits) {
            hits++;
        }
        if (size == hits) {
            sank = true;
        }
    }

    static List<Ship> getShips() {
        return List.of(
                new Ship("Aircraft Carrier", 5),
                new Ship("Battleship", 4),
                new Ship("Submarine", 3),
                new Ship("Cruiser", 3),
                new Ship("Destroyer", 2));
    }

    @Override
    public String toString() {
        return name;
    }
}
