package main.home012;

import java.util.Scanner;

/*
3.	(2 балла) Старый телефон Андрея сломался, поэтому он решил приобрести новый. Продавец телефонов предлагает разные
варианты, но Андрея интересуют только модели серии samsung или iphone. Также Андрей решил рассматривать телефоны
только от 50000 до 120000 рублей. Чтобы не тратить время на разговоры, Андрей хочет написать программу, которая
поможет ему сделать выбор.

На вход подается строка – модель телефона и число – стоимость телефона.
Нужно вывести "Можно купить", если модель содержит слово samsung или iphone и стоимость от 50000 до 120000 рублей
включительно. Иначе вывести "Не подходит".

Гарантируется, что в модели телефона не указано одновременно несколько серий.

Входные данные:
iphone XL
58000

nokia 10
100000

samsung Galaxy (GT-I7500)
40000

samsung S 21
120000

Выходные данные:
Можно купить
Не подходит
Не подходит
Можно купить
 */
public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        int price = scanner.nextInt();
        String i = "iphone";
        String s = "samsung";

        if ((model.contains(i) || model.contains(s)) && (price >= 50000 && price <= 120000)) {
            System.out.println("Можно купить");
        } else {
            System.out.println("Не подходит");
        }
    }
}
