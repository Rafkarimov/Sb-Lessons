package main.project01;

import java.math.BigDecimal;

/*
Напишите клиент этого класса – программу, которая создает банковский счет с годовой процентной ставкой 5,5%,
балансом 1000 руб., id 1122 и именем Герман. Внесите на счет 300, 400 и 500 руб. и снимите со счета 500, 400 и 200 руб.
Отобразите сводку по счету с указанием имени владельца счета, процентной ставки, баланса и всех транзакций
 */
public class AccountClient {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(5.5D);
        Account account = new Account("Герман", new BigDecimal(1_000));
        account.deposit(new BigDecimal(300));
        account.deposit(new BigDecimal(400));
        account.deposit(BigDecimal.valueOf(500));

        account.withdraw(BigDecimal.valueOf(500));
        account.withdraw(BigDecimal.valueOf(400));
        account.withdraw(BigDecimal.valueOf(200));

//        account.getTransactions().forEach(System.out::println); // это для красоты, чтобы печаталось друг над другом.
        account.printAccountSummery();
    }
}
