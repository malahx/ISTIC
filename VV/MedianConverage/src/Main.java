import java.util.Random;

public class Main {
    public static void main(String... args) {
        int i = 0;
        Median median = new Median();
        while (!(median.coverage.contains("a1") &&
                median.coverage.contains("a2") &&
                median.coverage.contains("b1") &&
                median.coverage.contains("c1") &&
                median.coverage.contains("c2"))) {
            int a = new Random().nextInt();
            int b = new Random().nextInt();
            int c = new Random().nextInt();
            median.median(a, b, c);
            System.out.println("Already covered: " + median.coverage);
            i++;
        }
        System.out.println("Coverage in " + i + " calls.");
    }
}
