package main.home033.beautycontest;

public class Dog {
    private final String nickname;

    public Dog(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
