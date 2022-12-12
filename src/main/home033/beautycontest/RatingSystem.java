package main.home033.beautycontest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

public class RatingSystem implements Comparable<RatingSystem> {
    private final DogOwner dogOwner;
    private final Dog dog;
    private final List<Integer> ratings;

    public RatingSystem(DogOwner dogOwner, Dog dog, List<Integer> ratings) {
        this.dogOwner = dogOwner;
        this.dog = dog;
        this.ratings = ratings;
    }

    public DogOwner getDogOwner() {
        return dogOwner;
    }

    public Dog getDog() {
        return dog;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public double getAverageRating() {
        double average = ratings.stream()
                .mapToInt(rating -> rating)
                .average()
                .orElse(0D);
        return Math.floor(average * 10) / 10D;
//        return BigDecimal.valueOf(average).setScale(1, RoundingMode.DOWN).doubleValue();
    }

    //для сравнения двух объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingSystem that = (RatingSystem) o;
        return dogOwner.equals(that.dogOwner) && dog.equals(that.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogOwner, dog);
    }

    // сортировка
    @Override
    public int compareTo(RatingSystem other) {
        //альтернатвный вариант
//        int thisSum = ratings.stream()
//                .mapToInt(rating -> rating)
//                .sum();
//        int otherSum = other.ratings.stream()
//                .mapToInt(rating -> rating)
//                .sum();
//        return Integer.compare(thisSum, otherSum);
        return Double.compare(getAverageRating(), other.getAverageRating());

    }

    @Override
    public String toString() {
        return "RatingSystem{" +
                "dogOwner=" + dogOwner +
                ", dog=" + dog +
                ", ratings=" + ratings +
                '}';
    }
}
