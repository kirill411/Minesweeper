import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();
        int firstDigit = inputNum / 1000;
        int secondDigit = inputNum % 1000 / 100;
        int thirdDigit = inputNum % 1000 % 100 / 10;
        int forthDigit = inputNum % 1000 % 100 % 10;

        if (firstDigit == forthDigit && secondDigit == thirdDigit) {
            System.out.println("1");
        } else {
            System.out.println("42");
        }
        scanner.close();
    }
}