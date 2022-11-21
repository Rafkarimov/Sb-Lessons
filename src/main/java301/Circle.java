package main.java301;

public class Circle {
    /** Радиус круга */
    double radius = 1; // <--- Поле данных
    /** Создает объект круга *///-----------------------
    Circle() { //                                      |
    } //                                               |
    /** Создает объект круга с указанным радиусом */// |<--- Конструкторы
    Circle(double newRadius) { //                      |
        radius = newRadius; //                           |
    } //------------------------------------------------
    /** Возвращает площадь этого круга *///--------
    double getArea() { //                         |
        return radius * radius * Math.PI; //        |
    } //                                          |
    /** Возвращает периметр этого круга *///      |
    double getPerimeter() { //                    |<--- Методы
        return 2 * radius * Math.PI; //             |
    } //                                          |
    /** Присваивает новый радиус этому кругу */// |
    void setRadius(double newRadius) { //         |
        radius = newRadius; //                      |
    } //-------------------------------------------
}
