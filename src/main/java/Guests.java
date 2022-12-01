import java.util.Scanner;

public class Guests {
    static int peopleAmount;
    public static int peopleAmount()
    {
        return peopleAmount;
    }
    public static void guests(){
    System.out.println("Добрейший вечерочек");
    Scanner scanner = new Scanner(System.in);
            System.out.println("На скольких человек необходимо разделить счёт?");


            while (true) {
                peopleAmount = scanner.nextInt();
                if (peopleAmount > 1) {
                    break;
                }
                if (peopleAmount <= 1) {
                    System.out.println("Некорректое число, пожалуйста введите число больше 1");
                }
                else{
                    System.out.println("Некорректный запрос, пожалуйста введите число больше 1");

                }
            }

    }
}
