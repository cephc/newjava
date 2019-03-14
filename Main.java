package dayone;


public class Main {
    public static void main(String[] args) {
        double b = 574321.234;
        System.out.printf("'%.1f'", b);

        double x = 92036.23502;
        System.out.printf("'%8.2f'", x);

        int y = 983;
        System.out.printf("'%+5d'", y);

        int f = 45;
        System.out.printf("'%05d'", f);

        int t = 2470;
        System.out.printf("%03d", t);

        int w = 1234567890;
        System.out.printf("%03d", w);

        int h = 4;
        System.out.printf("%-3d", h);

        int d = 99;
        System.out.printf("%3d", d);

    }
}
