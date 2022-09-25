import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        // 3602;
        int add_time = N.nextInt();
        int h = (add_time / 3600) % 24;
        int min1 = add_time / 60 % 60 % 10;
        int min2 = add_time / 60 % 60 / 10;
        int s1 = add_time % 60 / 10;
        int s2 = add_time % 10;
        System.out.println(h + ":" + min1 + min2 + ":" + s1 + s2);
    }
}