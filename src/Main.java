import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String numbers = in.nextLine();
        //Разбитие строки на числа и конвертирование в int
        String[] array = numbers.split(" ");
        String str1, str2, str3;
        str1 = array[0];
        str2 = array[1];
        str3 = array[2];
        int number1, number2, number3, flag;
        flag = 0;
        number1 = Integer.parseInt(str1);
        number2 = Integer.parseInt(str2);
        number3 = Integer.parseInt(str3);
        // Проверка на 3-х значность
        if( number1 >= 100 && number1 <= 999 && number1 % 5 == 0){
            ++flag;
        }
        if (number2 >= 100 && number2 <= 999 && number2 % 5 == 0){
            ++flag;
        }
        if (number3 >= 100 && number3 <= 999 && number3 % 5 == 0){
            ++flag;
        }
        if (flag >= 2){
            System.out.println("true");
        }
        if (flag < 2){
            System.out.println("false");
        }
    }
}