import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cord = new Scanner(System.in);
        double x = cord.nextDouble();
        System.out.println(x>=-2.0 && x<=3.0 || x>=6.0 && x<=9.0 ? "false" : "true");
    }
}