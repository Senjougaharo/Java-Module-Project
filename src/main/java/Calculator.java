import java.util.Scanner;

public class Calculator {

    public void calculator() {
        Products list = new Products();
        double price = list.Price();
        Guests Guests = new Guests();
        int peopleAmount = Guests.peopleAmount();

        double score = price / peopleAmount;
        String finalPriсe = "Общая сумма составила %.2f ";
        String Deal = "\nКаждый человек должен заплатить %.2f ";
        System.out.println(String.format(finalPriсe, price) + endWord(price) + "." + String.format(Deal+ endWord(score) + "."));
    }

    public String endWord(double a) {
        int cur = (int) Math.floor(a);
        if (cur % 100 > 5 && cur <= 20) {
            return "рублей";
        } else if (cur % 10 == 1) {
            return "рубль";
        } else if (cur % 10 > 1 && cur % 10 < 5) {
            return "рубля";
        }
        return "рублей";
    }
}