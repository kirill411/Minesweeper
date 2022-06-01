package minesweeper;

import java.util.*;

enum GameStatus {
    START, FIRST_MOVE, MOVE, BLOWUP, WIN
}

public class Main {

    static GameStatus status = GameStatus.START;
    static Scanner scanner = new Scanner(System.in);
    static MineField mineField;

    public static void main(String[] args) {

        String userInput;
        boolean gameOn = true;

        while (gameOn) {
            switch (status) {
                case START:
                    System.out.println("How many mines do you want on the field?");
                    userInput = scanner.nextLine();

                    if (illegalInputCheck(userInput)){
                        continue;
                    }

                    mineField = new MineField(Integer.parseInt(userInput));
                    mineField.printField();
                    status = GameStatus.FIRST_MOVE;
                    break;
                case FIRST_MOVE:
                case MOVE:
                    System.out.print("Set/unset mines marks or claim a cell as free:");
                    userInput = scanner.nextLine();

                    if (illegalInputCheck(userInput)) {
                        continue;
                    }

                    takeAction(userInput);
                    break;
                case BLOWUP:
                    System.out.println("You stepped on a mine and failed!\n");
                    gameOn = false;
                    break;
                case WIN:
                    System.out.println("Congratulations! You found all the mines!\n");
                    gameOn = false;
                    break;
            }
        }
    }

    static boolean illegalInputCheck(String input) {

        switch (status) {
            case START:
                if (!input.matches("[0-9]+")) {
                    System.out.println("Enter a number from 1 to 15, please.");
                    return true;
                }
                break;
            case FIRST_MOVE:
            case MOVE:
                if (!input.matches("[1-9] [1-9] free|[1-9] [1-9] mine")) {
                    System.out.println("Wrong input");
                    return true;
                }
                break;
        }
        return false;
    }

    static void takeAction(String input) {
        int x = input.charAt(2) - 49;
        int y = input.charAt(0) - 49;

        if (input.substring(4).equals("free")) {
            if (status == GameStatus.FIRST_MOVE) {
                mineField.chargeMines(x, y);
                mineField.scanMinesAround();
                status = GameStatus.MOVE;
            }
            status = mineField.discoverCell(x, y, status);
        } else {
            mineField.putFlagOnCell(x, y);
            status = mineField.countFlags(status);
        }

        mineField.printField();
    }
}