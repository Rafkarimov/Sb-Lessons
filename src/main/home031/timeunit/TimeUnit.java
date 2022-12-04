package main.home031.timeunit;

/*
4.	Необходимо реализовать класс TimeUnit с функционалом, описанным ниже (необходимые поля продумать самостоятельно).
Обязательно должны быть реализованы валидации на входные параметры.
Конструкторы:
●	Возможность создать TimeUnit, задав часы, минуты и секунды.
●	Возможность создать TimeUnit, задав часы и минуты. Секунды тогда должны проставиться нулевыми.
●	Возможность создать TimeUnit, задав часы. Минуты и секунды тогда должны проставиться нулевыми.
Публичные методы:
●	Вывести на экран установленное в классе время в формате hh:mm:ss
●	Вывести на экран установленное в классе время в 12-часовом формате (используя hh:mm:ss am/pm)
●	Метод, который прибавляет переданное время к установленному в TimeUnit (на вход передаются только часы,
минуты и секунды).

 */
public class TimeUnit {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeUnit(int hours, int minutes, int seconds) {
        // hours 0 до 23 включительно
        // minutes и seconds 0 до 59
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeUnit(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public TimeUnit(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return getTime(hours) + ":"
                + getTime(minutes) + ":"
                + getTime(seconds)
                + (hours <= 12 ? " am" : " pm");
    }

    private String getTime(int time) {
        int tmp = time > 12 ? time - 12 : time;
        if (tmp == 0) {
            return "00";
        } else if (tmp < 10) {
            return "0" + tmp;
        } else {
            return String.valueOf(tmp);
        }
//        return tmp == 0 ? "00" : tmp < 10 ? "0" + tmp : String.valueOf(tmp); другой вариант написания без ис елсе
        //(minutes == 0 ? "00" : minutes < 10 ? "0" + minutes : minutes)
        //(seconds == 0 ? "00" : seconds < 10 ? "0" + seconds : seconds)
    }

    public void addTime(int hours, int minutes, int seconds) {
        this.hours += hours; // прибавляем к часам
        this.minutes += minutes;
        this.seconds += seconds;
//через if
//        if (this.seconds > 59) {
//            this.minutes += 1;
//            this.seconds -= 60;
//        }
//        if (this.minutes > 59) {
//            this.hours += 1;
//            this.minutes -= 60;
//        }
//        if (this.hours > 23) {
//            this.hours -= 24;
//        }
        if (this.seconds > 59) {
            this.seconds %= 60;
            this.minutes += seconds / 60;
            this.hours += seconds / 3600;
            System.out.println(seconds);
            System.out.println(seconds / 60);
            System.out.println(seconds / (60 * 60));
        }
        if (this.minutes > 59) {
            this.minutes %= 60;
            this.hours += minutes / 60;
            System.out.println(minutes / 60);
        }
        if (this.hours > 23) {
            this.hours %= 24;
        }
    }
}
