package main.java20230121.task4;

//Написать аннотацию, содержащую некоторую информацию о классе:
// автор, дата создания класса, номер текущей версии, список ревьюеров.
@ClassDescriptor(
        author = "Andrey",
        date = "20.09.2022",
        currentVersion = 6,
        reviewers = {"Anna", "Victor"}
)
public class ClassWithDescriptor {
}
