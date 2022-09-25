import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        Scanner bs = new Scanner(System.in);
        Scanner cs = new Scanner(System.in);
        int rub =as.nextInt();
        int cop = bs.nextInt();
        int count = cs.nextInt();
        double cost;
        double price;
        cost = (rub * 100 + cop);
        price =((cost / 100.0) + (cost % 100.0) / 100.0) * count;
        System.out.printf("%.1f", price);
    }
}