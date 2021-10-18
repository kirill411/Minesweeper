import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int four = 4;
        final int hundred = 100;
        final int fourHund = 400;

        int inputNum = scanner.nextInt();
        boolean leapYear = inputNum % four == 0 && inputNum % hundred != 0 || inputNum % fourHund == 0;

        if (leapYear) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
        scanner.close();
    }
}