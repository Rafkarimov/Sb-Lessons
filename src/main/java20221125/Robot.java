package main.java20221125;
/*
    Робот.
    Умеет повернуть влево,
    повернуть вправо, идти на 1 шаг.
    Несколько конструкторов,
    хранение координат, x и y
    вывод координат на экран.
 */

public class Robot {
    private int x;
    private int y;

    private int direction; // 0- top, 1 - right, 2 - bottom, 3 -left

    public Robot() {
        x = 0;
        y = 0;
        direction = 0;
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
        direction = 0;
    }

    public Robot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void go() {
        System.out.println("Initial X " + x);
        System.out.println("Initial Y " + y);
        System.out.println("Initial direction " + direction);
        System.out.println("------------------------------");
        System.out.println("!!! GO GO GO !!!");
        System.out.println("------------------------------");

        // 0- top, 1 - right, 2 - bottom, 3 -left
        switch (direction) {
            //top
            case 0:
                y++;
                break;
            case 1:
                x++;
                break;
            case 2:
                y--;
                break;
            case 3:
                x--;
                break;
            default:
                break;
        }
        System.out.println("!!! STOP WALKING !!!");
        System.out.println("------------------------------");
        System.out.println("After walk X " + x);
        System.out.println("After walk Y " + y);
        System.out.println("After walk direction " + direction);
        System.out.println("------------------------------");

    }
    public void printCoordinates(){
        System.out.println("(x, y) == " + x + " " + y);
    }
    public void turnLeft() {
        System.out.println("!!! TURNING LEFT !!!");
        System.out.println("------------------------------");
        direction = (direction - 1) % 4;

    }
    public void turnRigth() {
        System.out.println("!!! TURNING RIGHT !!!");
        System.out.println("------------------------------");
        direction = (direction + 1) % 4;
    }
}
