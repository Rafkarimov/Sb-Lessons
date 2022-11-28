package main.project01;

import java.math.BigDecimal;
import java.util.Scanner;

public class AccountMain {
    private static final Account[] accounts = new Account[10];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        createAccounts();


        while (true) {
            System.out.print("Введите id: ");
            int accountId = sc.nextInt();
            if (accountId == -1) {
                break;
            }
            if (!validateAccountId(accountId)) {
                System.out.print("Неверный id. Введите корректный id: ");
            } else {
                Account account = getAccountById(accountId);
                boolean flag = true;
                while (flag) {
                    showMainMenu();
                    int n = sc.nextInt();
                    switch (n) {
                        case 1:
                            System.out.println("Баланс равен: " + account.getBalance());
                            break;
                        case 2:
                            System.out.print("Введите сумму для снятия со счета: ");
                            account.withdraw(BigDecimal.valueOf(sc.nextInt()));
                            break;
                        case 3:
                            System.out.print("Введите сумму для внесения на счет: ");
                            account.deposit(BigDecimal.valueOf(sc.nextInt()));
                            break;
                        default:
                            flag = false;
                            break;
                    }
                }
            }
        }


//        Arrays.stream(accounts).forEach(System.out::println);

//        Account account = new Account(new BigDecimal(20_000)); // как еще можно
//        BigDecimal x = new BigDecimal("1000");
//        //Установим значение годовой процентной ставки по счету для класса через вызов статического метода:
//        Account.setAnnualInterestRate(4.5);
//        //Снимем деньги со счета, используя соответствующий метод:
//        account.withdraw(BigDecimal.valueOf(2500));
//        //Пополним счет, используя соответствующий метод:
//        account.deposit(BigDecimal.valueOf(3000));
//        //Выведем в консоль информацию по созданному банковскому счету:
//        System.out.println("Баланс равен " + account.getBalance() + " руб.");
//        System.out.println("Ежемесячный процент равен " + account.getMonthlyInterest() + " руб.");
//        System.out.println("Этот счет был создан " + account.getDateCreated());
    }

    private static void createAccounts() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(new BigDecimal(10_000));
        }
    }

    private static boolean validateAccountId(int accountId) {
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                return true;
            }
        }
        return false;
    }

    private static void showMainMenu() {
        System.out.print(
                "\nОсновное меню: " +
                        "\n1: проверить баланс счета" +
                        "\n2: снять со счета" +
                        "\n3: положить на счет" +
                        "\n4: выйти" +
                        "\nВведите пункт меню: ");
    }

    private static void menuAction() {

    }

    private static Account getAccountById(int accountId) {
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                return account;
            }
        }
        throw new RuntimeException("Акаунт не найден");
    }
}


/*
Используя уже созданный класс Account, смоделируйте работу банкомата. Создайте 10 банковских счетов в массиве
с идентификаторами (далее — id) 0, 1, …, 9 и начальным балансом 10 000 рублей. Система запрашивает у пользователя
ввести id. Если введен некорректный id, то попросите пользователя ввести корректный id. После получения корректного
id отображается главное меню, как показано в примере запуска. Можно ввести пункт меню 1 для просмотра текущего баланса,
2 — для снятия денег со счета, 3 — для внесения денег на счет и 4 — для выхода из основного меню. После выхода система
снова запрашивает id, таким образом, после запуска она не останавливается.


 */