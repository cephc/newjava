package dayone;

public class calculator{
    public static void main(String[] args) {
        System.out.println(mult(9,5));
    }

    public static int mult(int y, int x) {
        return y * x;
    }

    public static int div(int y, int x){
        return y / x;
    }

    public static int add(int y, int x){
        return y + x;
    }

    public static int sub(int y, int x){
        return y - x;
    }

    public static double pow(double y, double x){
        return Math.pow(y,x);
    }

}