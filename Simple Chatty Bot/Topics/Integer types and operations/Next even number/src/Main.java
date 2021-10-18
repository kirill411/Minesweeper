import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short input = scanner.nextShort();

        System.out.println(input + (2 - input % 2));

        scanner.close();
    }
}