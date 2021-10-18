import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int zero = 0;

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean isFirstPositive = num1 > zero && num2 <= zero && num3 <= zero;
        boolean isSecondPositive = num1 <= zero && num2 > zero && num3 <= zero;
        boolean isThirdPositive = num1 <= zero && num2 <= zero && num3 > zero;
        boolean isOnePositive = isFirstPositive ^ isSecondPositive ^ isThirdPositive;
        System.out.println(isOnePositive);
        scanner.close();
    }
}