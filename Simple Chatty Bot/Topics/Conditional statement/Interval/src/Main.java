import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();
        boolean inRange1 = -15 < inputNum && inputNum <= 12;
        boolean inRange2 = 14 < inputNum && inputNum < 17;
        boolean inRange3 = 19 <= inputNum;

        if (inRange1 || inRange2 || inRange3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();
    }
}