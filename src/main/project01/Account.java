package main.project01;
/*
Используя уже созданный класс Account, смоделируйте работу банкомата. Создайте 10 банковских счетов в массиве
с идентификаторами (далее — id) 0, 1, …, 9 и начальным балансом 10 000 рублей. Система запрашивает у пользователя
ввести id. Если введен некорректный id, то попросите пользователя ввести корректный id. После получения корректного
id отображается главное меню, как показано в примере запуска. Можно ввести пункт меню 1 для просмотра текущего баланса,
2 — для снятия денег со счета, 3 — для внесения денег на счет и 4 — для выхода из основного меню. После выхода система
снова запрашивает id, таким образом, после запуска она не останавливается.


 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Account {
    private static BigDecimal annualInterestRate;
    private static int count = 0; // счетчик

    private int id;
    private BigDecimal balance;
    private final LocalDate dateCreated;



    //Добавим в класс конструктор без параметров. Определим в конструкторе значение только одного параметра –
    // дата создания счета – с текущей датой и временем
    public Account() {
        dateCreated = LocalDate.now();
    }


    //Добавим конструктор, в котором будут определяться значения полей id и balance:
    public Account(BigDecimal balance) {
        id = count++;
        this.balance = balance;
        dateCreated = LocalDate.now();
    }
    //Добавим getter-методы для четырех полей класса:

    /**
     * Возвращает id
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает баланс
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Возвращает годовую процентную ставку
     */
    public static BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Возвращает дату создания счета
     */
    public LocalDate getDateCreated() {
        return dateCreated;
    }
    //Добавим setter-методы для трех полей, один из которых статический:

    /**
     * Присваивает новый id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Присваивает новый баланс
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * Присваивает новую годовую процентную ставку
     */
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = BigDecimal.valueOf(annualInterestRate);
    }

    //Добавим метод, который возвращает ежемесячный процент:
    public BigDecimal getMonthlyInterest() {
        return balance.multiply(annualInterestRate.divide(BigDecimal.valueOf(1200), RoundingMode.FLOOR));
    }

    //Добавим метод, который снимает со счета указанную сумму:
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    //Добавим метод, который пополняет счет на указанную сумму:
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }


}

