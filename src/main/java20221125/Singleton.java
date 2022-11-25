package main.java20221125;
/*
Синглтон
Design patterns
банда четырех
Вернет вам состояние вашего экземпляра всегда в единственном числе
Например коннекты к базе данных
Если на каждый чих открывать новый коннекшн то плохо
Подключение к ftp
Не полный синглтон
На собеседованиях с синхронизацией просят
 */

public class Singleton { // Паттер для класса
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
