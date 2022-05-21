package battleship;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        BattleShip game = new BattleShip();
        game.start();
    }
}

class BattleShip {

    final static Scanner SCANNER = new Scanner(System.in);

    Player[] players = {new Player("Player 1"), new Player("Player 2")};
    Player currentPlayer = players[0];


    private boolean endGame = false;


    private Player getOpponent() {
        return currentPlayer == players[0] ? players[1] : players[0];
    }

    void start() {
        for (Player p : players) {
            requestShipDisplacement(p);
            System.out.println("Press Enter and pass the move to another player");
            SCANNER.nextLine();
        }


        System.out.println("The game starts!");

        while (true) {
            makeAMove(currentPlayer);
            if (endGame) {
                break;
            }
            System.out.println("Press Enter and pass the move to another player");
            SCANNER.nextLine();
            currentPlayer = getOpponent();
        }
    }

    void makeAMove(Player player) {
        System.out.println(player + ", it's your turn:\n");
        printGameField(getOpponent(), true);
        System.out.println("---------------------");
        printGameField(player, false);
        System.out.println("Take a shot!");
        try {
            Coordinate cord = new Coordinate(SCANNER.nextLine().toUpperCase());
            takeAShot(getOpponent(), cord);
        } catch (IllegalArgumentException e) {
            System.out.println("Error! " + e.getMessage() + " Try again:");
        }

    }

    private void takeAShot(Player player, Coordinate cord) {
        Cell cell = player.field[cord.row][cord.col];
        String message;

        message = cell.hit() ? "You hit a ship! " : "You missed! ";

        if (cell.hit() && cell.ship.sank) {
            player.ships.remove(cell.ship);
            message = "You sank a ship! Specify a new target:";
        }

        if (player.ships.size() == 0) {
            message = "You sank the last ship. You won. Congratulations!";
            endGame = true;
        }
        System.out.println(message);
    }

    private void requestShipDisplacement(Player player) {
        System.out.println(player + ", place your ships on the game field\n");
        printGameField(player, false);
        for (Ship ship : Ship.getShips()) {
            System.out.println("\nEnter the coordinates of the " + ship + " (" + ship.getSize() + " cells):");
            while (true) {
                String[] input = SCANNER.nextLine().toUpperCase().split(" ");
                try {
                    Coordinate xy1 = new Coordinate(input[0]); //Constructors may throw exception
                    Coordinate xy2 = new Coordinate(input[1]);

                    Coordinate.checkRightPlacement(xy1, xy2, ship, player.field); //This method may also throw exception
                    allocateShip(player, xy1, xy2, ship);
                    break;
                } catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
                    System.out.println("Error! " + e.getMessage() + " Try again:");
                }
            }
            printGameField(player, false);
        }
        System.out.println();
    }

    //Drawing ship symbols on a game board
    private void allocateShip(Player player, Coordinate xy1, Coordinate xy2, Ship ship) {
        for (int i = Math.min(xy1.row, xy2.row); i <= Math.max(xy1.row, xy2.row); i++) {
            for (int j = Math.min(xy1.col, xy2.col); j <= Math.max(xy1.col, xy2.col); j++) {
                player.field[i][j].markShip(ship);
            }
        }
        player.ships.add(ship);
    }

    private void printGameField(Player player, boolean fogOfWar) {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < player.field.length; i++) {
            String row = Arrays.toString(player.field[i])
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "");
            if(fogOfWar){
                row = row.replaceAll("O", "~");
            }
            char c = (char)(i + 'A');
            System.out.println(c + " " + row);
        }
    }
}