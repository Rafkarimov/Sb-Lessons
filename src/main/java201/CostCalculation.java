package main.java201;
/*
Напишите программу, которая вычисляет полную стоимость товара. Данные, используемые для расчета: стоимость единицы
товара в рублях, количество единиц товара, включение/не включение НДС (20%) в стоимость товара. Если количество единиц
товара больше или равно 10, то действует скидка 5%.

Подсказка: для получения полной стоимости товара используйте перегруженные методы.

В этом подразделе на видео демонстрируется решение задачи. Постарайтесь не переходить к просмотру видео до того,
как попробуете самостоятельно решить задачу.

Введем для проверки стоимость единицы товара равной 5, количество товара равным 10. На предложение о включении
НДС в стоимость, введем ответ, которого нет в предложенных вариантах.
Повторно отображается тот же самый запрос, так как мы ввели некорректное значение.
Введём «не включать НДС в стоимость».
Отображается расчет стоимости равный 47.5
Проверим еще один путь выполнения программы.
Введем стоимость единицы товара равной 10, количество товара равным 5. Включим НДС в стоимость.
Отображается расчет стоимости, равный 60.

 */


import java.util.Scanner;

public class CostCalculation {
    static final int DISCOUNT_FIVE = 5; // скидка в %
    static final double VALUE_ADDED_TAX = 20; // ставка ГДС в %

    public static void main(String[] args) {
        double unitCost; // стоимость единицы товара
        int amount; // количество товара
        String includeVatResponse; // включение НДС в стоимость товара
        double fullCost; // полная стоимость товара

        var in = new Scanner(System.in);

        //Получить стоимость единицы товара
        System.out.println("Введите стоимость единицы товара: ");
        unitCost = in.nextDouble();

        //Получить количество товара
        System.out.println("Введите количество товара: ");
        amount = in.nextInt();

        //Получить ответ на включение НДС в стоимость товара до тех пор, пока не введено корректное значение
        do {
            System.out.println("Влючать НДС в стоимость (y/n): ");
            includeVatResponse = in.next();
        } while (!"y".equalsIgnoreCase(includeVatResponse) && !"n".equalsIgnoreCase(includeVatResponse));

        //Получить полную стоимость товара по полученным данным
        if ("y".equalsIgnoreCase(includeVatResponse)) {
            //в стоимость включать НДС
            if (amount >= 10) {
                //в стоимости учитывать скидку
                fullCost = getFullCost(unitCost, amount, DISCOUNT_FIVE, VALUE_ADDED_TAX);
            } else {
                //в стоимости не учитывать скидку
                fullCost = getFullCost(unitCost, amount, VALUE_ADDED_TAX);
            }
        } else {
            //в стоимость не включать НДС
            if (amount >= 10) {
                // в стоимости учитывать скидку
                fullCost = getFullCost(unitCost, amount, DISCOUNT_FIVE);
            } else {
                //в стоимости не учитывать скидку
                fullCost = getFullCost(unitCost, amount);
            }
        }
        //Вывести результат расчета полной стоимости товара
        System.out.println("Полная стоимость товара: " + fullCost);
    }

    /*
    получение полной стоимости товара, без включения НЛС и без скидки
     */
    public static double getFullCost(double unitCost, int amount) {
        return unitCost * amount;
    }

    /*
    Получение полной стоимости товара, без включения НДС и с учетом скидки
     */
    public static double getFullCost(double unitCost, int amount, int discount) {
        double priceWithDiscount = unitCost * (1 - discount / 100.0) * amount; // цена со скидкой
        return Math.round(priceWithDiscount * 100) / 100.0; // округление до копейки
    }

    /*
    Получение полной стоимости товара, включая НДС и без скидки
     */
    public static double getFullCost(double unitCost, int amount, double valueAddedTax) {
        double priceWithoutVAT = unitCost * amount; // цена без НДС
        double priceWithVAT = priceWithoutVAT * (1 + valueAddedTax / 100); // цена с НДС
        return Math.round(priceWithVAT * 100) / 100.0;//округление до копеек
    }

    /*
    Получение полной стоимости товара, включая НДС и со скидкой
     */
    public static double getFullCost(double unitCost, int amount, int discount, double valueAddedTax) {
        double priceWithoutVAT = unitCost * (1 - discount / 100.0) * amount; // цена со скидкой
        double priceWithVAT = priceWithoutVAT * (1 + valueAddedTax / 100); // цена с НДС
        return Math.round(priceWithVAT * 100) / 100.0;//округление до копеек
    }

}
