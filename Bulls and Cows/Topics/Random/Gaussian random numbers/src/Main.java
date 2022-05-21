import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        long seed = k;
        while (true) {
            Random random = new Random(seed);
            boolean flag = true;

            for (int i = 0; i < n; i++) {
                if (random.nextGaussian() > m) {
                    flag = false;
                }
            }

            if (flag) {
                System.out.println(seed);
                break;
            }
            seed++;
        }
    }
}