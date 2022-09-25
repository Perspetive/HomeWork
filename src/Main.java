import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int N = num.nextInt(); // Трёхзначное число
        int x1, x2, x3, sum, next_num;
        x1 = N%10;
        x2 = (N%100)/10;
        x3 = (N%1000)/100;
        sum = x1+x2+x3;
        next_num = (N / 2) * 2 + 2;
        System.out.println(sum);
        System.out.println(next_num);
    }
}