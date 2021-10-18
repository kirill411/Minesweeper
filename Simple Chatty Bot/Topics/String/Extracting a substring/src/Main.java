import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int beginIndex = scanner.nextInt();
        int endIndex = scanner.nextInt() + 1;
        System.out.println(inputString.substring(beginIndex, endIndex));
        scanner.close();
    }
}