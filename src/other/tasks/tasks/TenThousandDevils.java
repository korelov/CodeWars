package other.tasks.tasks;

public class TenThousandDevils {

    private static void print(int number) {
        if (number > 0) {
            System.out.println("Учим Java, роняя слезы");
            print(number - 1);
        }
    }

    public static void main(String[] args) {
        // System.out.println("Учим Java, роняя слезы\n".repeat(10_000));
        print(10_000);
    }
}
