import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        long product = beginNum;

        for (int i = beginNum + 1; i < endNum; i++) {
            product *= i;
        }
        System.out.println(product);
        scanner.close();
    }
}