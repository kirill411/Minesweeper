import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int okParts = 0;
        int fixedParts = 0;
        int rejectParts = 0;
        int inputCount = scanner.nextInt();

        for (int i = 0; i < inputCount; i++) {
            int parts = scanner.nextInt();
            if (parts == 0) {
                okParts++;
            }
            if (parts == 1) {
                fixedParts++;
            }
            if (parts == -1) {
                rejectParts++;
            }
        }

        System.out.println(okParts + " " + fixedParts + " " + rejectParts);
        scanner.close();
    }
}