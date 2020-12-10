public class DrawShap {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int n = 0; n <= i - 1; n++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            }
        }
    }

