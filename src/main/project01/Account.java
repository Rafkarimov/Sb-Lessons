package main.project01;
/*
Используя уже созданный класс Account, смоделируйте работу банкомата. Создайте 10 банковских счетов в массиве
с идентификаторами (далее — id) 0, 1, …, 9 и начальным балансом 10 000 рублей. Система запрашивает у пользователя
ввести id. Если введен некорректный id, то попросите пользователя ввести корректный id. После получения корректного
id отображается главное меню, как показано в примере запуска. Можно ввести пункт меню 1 для просмотра текущего баланса,
2 — для снятия денег со счета, 3 — для внесения денег на счет и 4 — для выхода из основного меню. После выхода система
снова запрашивает id, таким образом, после запуска она не останавливается.




Спроектируйте и реализуйте новый класс Account на основе предыдущего следующим образом:
Добавьте новое поля данных name типа String, чтобы сохранить имя клиента.
Добавьте новый конструктор, который создает банковский счет с указанными name, id и balance.
Добавьте новое поле данных с именем transactions типа ArrayList, в котором хранятся транзакции по счету. Каждая
транзакция является экземпляром класса Transaction, который должен быть определен, как показано на следующем рисунке.

Измените методы withdraw() и deposit() таким образом, чтобы добавлять каждую транзакцию в массив транзакций.
Все остальные свойства и методы нового класса Account остаются такими же, как в старом.
Напишите клиент этого класса – программу, которая создает банковский счет с годовой процентной ставкой 5,5%,
балансом 1000 руб., id 1122 и именем Герман. Внесите на счет 300, 400 и 500 руб. и снимите со счета 500, 400 и 200 руб.
Отобразите сводку по счету с указанием имени владельца счета, процентной ставки, баланса и всех транзакций
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Account {
    private static int count = 1_000;
    private static BigDecimal annualInterestRate;

    private int id;
    private BigDecimal balance;
    private LocalDate dateCreated;
    private String name;
    private List<Transaction> transactions; // по умолчанию null

    //Добавим конструктор, в котором будут определяться значения полей id и balance:

    public Account(String name, BigDecimal balance) {
        this.id = count++;
        this.name = name;
        this.balance = balance;
        transactions = new ArrayList<>(); // иначе будет null, а так будет пустой массив
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
        Transaction transaction =
                new Transaction(TransactionType.MINUS, amount, balance, "Снимаем бабло: " + amount);
        transactions.add(transaction);
    } // subtract - минус

    //Добавим метод, который пополняет счет на указанную сумму:
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        Transaction transaction =
                new Transaction(TransactionType.PLUS, amount, balance, "Пополнить бабло: " + amount);
        transactions.add(transaction);
    } // add - плюс

    public String getName() {
        return name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void printAccountSummery() {
        String result = "Имя владельца: " + name + "\n"
                + "Процентная стравка: " + annualInterestRate + "\n"
                + "Баланс счета: " + balance + "\n"
                + getTransactionsAzString();
        System.out.println(result);
    }

    private String getTransactionsAzString() {
//        AtomicInteger i = new AtomicInteger(0); // как count счетчик, можно в стримах использовать
//        return transactions.stream()
//                .map(transaction -> i.incrementAndGet() + ": " + transaction.toString()) // метод референс
//                .collect(Collectors.joining("\n"));
        return IntStream.range(0, transactions.size()) // создает поток из цифр 0,1,2,3,5,
                .mapToObj(i -> (i + 1) + ":" + transactions.get(i).toString()) //mapToObj метод делает i Объект
                .collect(Collectors.joining("\n")); //собрали все объекты и "\n".
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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

