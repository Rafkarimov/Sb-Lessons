package main.home033.beautycontest;
/*
4
Иван
Николай
Анна
Дарья
Жучка
Кнопка
Цезарь
Добряш
7 6 7
8 8 7
4 5 6
9 9 9
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainBeautyContest {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> humanNames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            humanNames.add(sc.next());
        }
        List<String> dogNames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dogNames.add(sc.next());
        }
        List<RatingSystem> ratingSystems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> dogRatings = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                dogRatings.add(sc.nextInt());
            }
            DogOwner owner = new DogOwner(humanNames.get(i));
            Dog dog = new Dog(dogNames.get(i));
            ratingSystems.add(new RatingSystem(owner, dog, dogRatings));
        }

        ratingSystems.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .map(rs -> rs.getDogOwner().getName() + ": " + rs.getDog().getNickname() + ", " + rs.getAverageRating())
                .forEach(System.out::println);
    }
}
