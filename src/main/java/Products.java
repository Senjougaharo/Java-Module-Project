import java.util.Scanner;

public class Products {

    static double Price;
    static double Price()
    {
        return Price;
    }

    public static void products() {
        Scanner scanner = new Scanner(System.in);
        String names = "";

        while (true) {
            System.out.println("Введите наименование товара:");
            String name = scanner.next();
            names += "Продукт: " + name + "." + " Стоимость: ";
            double price;
            while (true) {
                System.out.println("Введите стоимость товара в формате \"рубли,копейки\":");
                price = scanner.nextDouble();

                if (price <=0) {
                    System.out.println("Некорректное значение. Попробуйте еще раз.");
                } else {
                    break;
                }
            }
            names += price + ".\n";
            Price += price;

            System.out.println("Товар добавлен в список!");
            System.out.println("Если хотите добавить еще товар, введите \"Да\".\nЕсли хотите завершить покупку, введите \"Завершить\".");
            String add = scanner.next();
            if (add.equalsIgnoreCase("да")) { }
            if (add.equalsIgnoreCase("Завершить")) {
                System.out.println("Добавленные товары:\n" + names);
                break;
            }
            else;
        }

    }

}