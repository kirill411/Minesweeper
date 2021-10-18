import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int six = 6;
        int sum = 0;
        int index = scanner.nextInt();

        for (int i = index; i > 0; i--) {
            int inputNum = scanner.nextInt();
            if (inputNum % six == 0) {
                sum += inputNum;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}