package main.project01;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/*
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
public class Transaction {
    private final UUID id;
    private final Date date;
    private final TransactionType type;
    private final BigDecimal amount;
    private final BigDecimal balance;
    private final String description;

    public Transaction(TransactionType type, BigDecimal amount, BigDecimal balance, String description) {
        id = UUID.randomUUID(); // создание уникальных id
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // почитать
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
