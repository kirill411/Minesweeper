package battleship;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    List<Ship> ships = new ArrayList<>();
    Cell[][] field = new Cell[10][10];

    public Player(String name) {
        this.name = name;

        //Initializing field
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = new Cell();
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
