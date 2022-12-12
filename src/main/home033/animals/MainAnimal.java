package main.home033.animals;

/*
Рассматриваются следующие животные:
● летучая мышь (Bat)
● дельфин (Dolphin)
● золотая рыбка (GoldFish)
● орел (Eagle)
Все животные одинаково едят и спят (предположим), и никто из животных не
должен иметь возможности делать это иначе.
Еще животные умеют по-разному рождаться (wayOfBirth):
● Млекопитающие (Mammal) живородящие.
● Рыбы (Fish) мечут икру.
● Птицы (Bird) откладывают яйца.
Помимо этого бывают некоторые особенности, касающиеся передвижения.
Бывают летающие животные (Flying) и плавающие (Swimming). Однако орел
летает быстро, а летучая мышь медленно. Дельфин плавает быстро, а золотая
рыбка медленно.
Согласно этим утверждениям нужно создать иерархию, состоящую из классов,
абстрактных классов и/или интерфейсов. Каждое действие или утверждение
подразумевает под собой вызов void метода, в котором реализован вывод на
экран описания текущего действия.
 */
public class MainAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Bat(); // Bat наследует от Animal
        animal1.eat();
        animal1.sleep();
//        ((Bat) animal1).viviparous();
        ((Bat) animal1).fly(); // приведение типа
        System.out.println("----------------------------------");

        //Второй способ
        GoldFish swimming1 = new GoldFish();
        swimming1.eat();
        swimming1.sleep();
        swimming1.spawn();
        swimming1.swim();
        System.out.println("----------------------------------");

        //третий способ
        Swimming swimming2 = new Dolphin();
        ((Dolphin) swimming2).eat();
        ((Dolphin) swimming2).sleep();
//        ((Dolphin) swimming2).viviparous();
        swimming2.swim();
        System.out.println("----------------------------------");

        Animal animal2 = new Eagle();
        animal2.eat();
        animal2.sleep();
        ((Eagle) animal2).theyLayEggs();
        ((Eagle) animal2).fly(); // приведение типа
        System.out.println("----------------------------------");
    }
}
