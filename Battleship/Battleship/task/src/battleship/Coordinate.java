package battleship;

//To eliminate multiple conversions of input in methods
//I decide to make this class
public class Coordinate {
    int row;
    int col;

    public Coordinate(String a) throws IllegalArgumentException {
        //Seems like using matches() are much more convenient to validate coordinate
        if(!a.substring(0, 1).matches("[A-J]") || !a.substring(1).matches("[1-9]|10")) {
            throw new IllegalArgumentException("You entered the wrong coordinates!");
        }
        row = a.charAt(0) - 'A';
        col = Integer.parseInt(a.substring(1)) - 1;
    }
    //Check that player didn't enter coordinates diagonally
    static void checkRightPlacement(Coordinate xy1, Coordinate xy2) {
        if (xy1.row == xy2.row && xy1.col == xy2.col
                || xy1.row != xy2.row && xy1.col != xy2.col) {
            throw new IllegalArgumentException("Wrong ship location!");
        }
    }
    //Check that player enters right coordinates for particular ship length
    static void checkRightPlacement(Coordinate xy1, Coordinate xy2, Ship ship) {
        if(xy1.row == xy2.row && Math.abs(xy1.col - xy2.col) + 1 != ship.getSize()
                || xy1.col == xy2.col && Math.abs(xy1.row - xy2.row) + 1 != ship.getSize()) {
            throw new IllegalArgumentException("Wrong length of the " + ship + "!");
        }
    }
    //Check that adjacent cells are not occupied
    static void checkRightPlacement(Coordinate xy1, Coordinate xy2, Ship ship, Cell[][] board) {
        checkRightPlacement(xy1, xy2);
        checkRightPlacement(xy1, xy2, ship);

        int rowMin = Math.min(xy1.row, xy2.row); //Player can type coordinates in any order.
        int rowMax = Math.max(xy1.row, xy2.row); //So, for correct looping we need to evaluate
        int colMin = Math.min(xy1.col, xy2.col); //Min and Max, otherwise we would need to have two
        int colMax = Math.max(xy1.col, xy2.col); //variants of loops.

        int length = board.length - 1;

        for (int i = rowMin; i <= rowMax; i++) {
            for (int j = colMin; j <= colMax; j++) {

                if (i > 0 && j > 0 && board[i - 1][j - 1].isOccupied()                  //TOP LEFT
                        || i > 0 && board[i - 1][j].isOccupied()                        //TOP MID
                        || j < length && i > 0 && board[i - 1][j + 1].isOccupied()      //TOP RIGHT
                        || j > 0 && board[i][j - 1].isOccupied()                        //LEFT
                        || j < length && board[i][j + 1].isOccupied()                   //RIGHT
                        || i < length && j > 0 && board[i + 1][j - 1].isOccupied()      //BOTTOM LEFT
                        || i < length && board[i + 1][j].isOccupied()                   //BOTTOM MID
                        || i < length && j < length && board[i + 1][j + 1].isOccupied() //BOTTOM RIGHT
                        || board[i][j].isOccupied()) {
                    throw new IllegalArgumentException("You placed it too close to another one.");
                }
            }
        }
    }
}
