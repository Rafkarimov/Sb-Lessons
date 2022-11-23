package main.project01;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    //Добавим в класс конструктор без параметров. Определим в конструкторе значение только одного параметра –
    // дата создания счета – с текущей датой и временем
    public Account() {
        dateCreated = new Date();
    }
    //Добавим конструктор, в котором будут определяться значения полей id и balance:
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    //Добавим getter-методы для четырех полей класса:
    /** Возвращает id */
    public int getId() {
        return id;
    }

    /** Возвращает баланс */
    public double getBalance() {
        return balance;
    }

    /** Возвращает годовую процентную ставку */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Возвращает дату создания счета */
    public Date getDateCreated() {
        return dateCreated;
    }
    //Добавим setter-методы для трех полей, один из которых статический:
    /** Присваивает новый id */
    public void setId(int id) {
        this.id = id;
    }

    /** Присваивает новый баланс */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** Присваивает новую годовую процентную ставку */
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    //Добавим метод, который возвращает ежемесячный процент:
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }
    //Добавим метод, который снимает со счета указанную сумму:
    public void withdraw(double amount) {
        balance -= amount;
    }
    //Добавим метод, который пополняет счет на указанную сумму:
    public void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        //Установим значение годовой процентной ставки по счету для класса через вызов статического метода:
        Account.setAnnualInterestRate(4.5);
        //Снимем деньги со счета, используя соответствующий метод:
        account.withdraw(2500);
        //Пополним счет, используя соответствующий метод:
        account.deposit(3000);
        //Выведем в консоль информацию по созданному банковскому счету:
        System.out.println("Баланс равен " + account.getBalance() + " руб.");
        System.out.println("Ежемесячный процент равен " + account.getMonthlyInterest() + " руб.");
        System.out.println("Этот счет был создан " + account.getDateCreated());
    }
}

