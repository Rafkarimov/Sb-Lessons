package main.java20221028;

public class BasicKnowledge {
    /*
    Поиск подстроки в строке
    Текст: Море, море, океан
    Regexp: море
    Найдет - "море"

    Сложнее:
    Поиск любого символа
    Regexp: А.я - "." - ожидается любой символ
    Текст:
    Аня
    Ася
    Оля
    Аля
    Валя

         Regexp: file.
        Текст:
        file.txt
        file1.txt
        file2.xls
        . - найдёт любой символ (один).
        Точка найдёт вообще любой символ, включая цифры, спецсимволы, даже пробелы
        Точку точка тоже найдёт!

    Скажем,
    мы хотим найти файлы с расширением
    txt и пишем такой шаблон:
    Regex: .txt
    Но под такой паттерн попадают и файлы вида atxt, так как . используется как паттерн, а не как символ, который
    мы хотим найти. Для того, чтобы . значила именно символ точки используется экранирование
    Regex: \.txt
    \. - точка (экранирование)

    Поиск по набору символов
    Допустим, мы хотим найти имена "Алла", "Анна" в списке. Можно попробовать поиск через точку, но кроме нормальных
    имён, вернется еще и всякий мусор:
    Regexp: А..а
    Текст:
    Анна
    Алла
    аоикА74арплт
    Аркан
    а^&f
    А66а

    Если же мы хотим именно Анну да Аллу, вместо точки нужно использовать диапазон допустимых значений.
Ставим квадратные скобки, а внутри них перечисляем нужные символы:
Regexp: А[нл][нл]а

Пример:
[нл] - только "н" или "л"
[а-я] - все русские буквы в нижнем регистре от "а" до "я" (кроме "ё")
[А-Я] - все заглавные русские буквы
[А-Яа-яЁё] - все русские буквы
[a-z] - латиница мелким шрифтом
[a-zA-z] - все английские буквы
[0-9] - любая цифра
[В-Ю] - буквы от "В" до "Ю" (да, диапазон - это не только от А до Я)
[А-ГО-Р] - буквы от "А" до "Г" и от "О" до "Р"

Один символ! Не два или десять, а один! Учтите это, если захотите написать что-то типа [1-31].
Нет, это не диапазон от 1 до 31, эта запись читается так:
Диапазон от 1 до 3 и число 1


Исключение
^ внутри [] означает исключение:
[^0-9] - любой символ, кроме цифр
[^ёЁ] - любой символ, кроме буквы ё
[^а-в8] - любой символ, кроме букв "а", "б", "в" и цифры 8

Regexp: fruits\[[0-9]\]
Текст:
fruits[0] = "апельсин";
fruits[1] = "яблоко";
fruits[2] = "лимон";

Разберём по частям регулярное выражение - fruits\[[0-9]\]
Сначала идёт просто текст "fruits".
Потом обратные слеш. Ага, он что-то экранирует.
Что именно? Квадратную скобку. Значит, это просто квадратная скобка в моём тексте "fruits["
Дальше снова квадратная скобка. Она не экранирована - значит, это набор допустимых значений.
Ищем закрывающую квадратную скобку. Она не экранирована - значит это конец набора допустимых значений. Следом идем \]
- закрывающая квадратная скобка, но уже экранированная.
Получается: fruits["любое однозначное число"]

Перечисление вариантов
Квадратные скобки [] помогают перечислить варианты для одного символа. Если же мы хотим перечислить слова, то лучше
использовать вертикальную черту - |.

Regex: Оля|Олечка|Котик - это | - или
Текст: Оля привет Котик

Можно использовать вертикальную черту и для одного символа.
Можно даже внутри слова - тогда вариативную букву берём в круглые скобки
Regex: А(н|л)я
Найдёт:
Аня
Аля

Метасимволы
Если мы хотим найти число, то пишем диапазон [0-9].
Если букву, то [а-яА-ЯёЁa-zA-z].

В регулярных выражения используются специальные метасимволы,
которые заменяют собой конкретные диапазоны значений:
Символ  Эквиваленты     Пояснение
\d      [0-9]           Цифровой символ
\D      [^0-9]          Нецифровой символ
\s      [ \f\n\r\t\v]   Пробельный символ
\S      [^ \f\n\r\t\v]  Непробельный символ
\w      [[:word:]]      Буквенный или цифровой символ или знак подчёркивания
\W      [^[:word:]]     Любой символ, кроме буквенного или цифрового символа или знака подчёркивания

Спецсимволы
Большинство символов в регулярном выражении представляют сами себя за исключением специальных символов:
[] \/ ^ $ . | ? * + () {}
Этим символы нужны, чтобы обозначить диапазон допустимых значений или границу фразы, указать количество повторений
или сделать что то ещё
В разных типах регулярных выражений этот набор различается



Квантификаторы (количество повторений)
Квантификаторы - так называют специальные символы в регулярных выражениях,
которые указывают количество повторений текста.
Символ "+" означает "одно или более повторений"

Какие есть квантификаторы, кроме знака "+"?
? - Ноль или одно
* - Ноль или более
+ - Один или более

Символ * часто используют с точкой - когда нам неважно, какой идёт текст до интересующей нас фразы,
мы заменяем его на ".*" - любой символ ноль или более раз.
Но будьте осторожны! Если использовать ".*" повсеместно, можно получить много ложноположительных срабатываний:
Regex: (Хихи)*(Хаха)*
Найдёт:
ХихиХаха
ХихиХихиХихи
Хихи
Хаха
ХихиХихиХахаХахаХаха

() - к группе символов.

Если мы хотим применить квантификатор к группе символов или нескольким словам, их нужно взять в скобки.

Квантификаторы применяют к символу или группе в скобках, которые стоят перед ним.
А что, если мне нужно определённое количество повторений?
Чтобы указать конкретное количество повторений, их надо записать внутри фигурных скобок:

{n} - ровно n раз
{m, n} - от m до n включительно
{m,} - не менее m
{,n} - не более n

Не забывайте - квантификатор применяется к последнему символу!

Regex: data{2}
Не найдёт:
datadata
Найдёт:
dataa

https://regex101.com/

Иногда квантификатор находит не совсем то, что нам нужно.
Regex: <.*>
Ожидание:
<req>
<query>Ан</query>
<gender>FEMALE</gender>

Реальность:
<req> <query>Ан</query> <gender>FEMALE</gender></req>
Мы хотим найти все теги HTML или XML по отдельности, а регулярное выражение возвращает целую строку,
внутри которой есть несколько тегов.

В некоторых реализациях квантификаторам соответствует максимально длинная строка из возможнных.
Такие квантификаторы называют - жадными

Если мы понимаем, что нашли не то, что хотели, можно пойти двумя путями:
1) Учитывать символы, не соответствующие желаемому образцу
2) Определить квантификатор как не жадный (ленивый, англ. lazy) - большинство реализаций
позволяют это сделать, добавив после него знак вопроса.
Как учитывать символы? Для примера с тегами можно написать такое регулярное выражение:
Regex: <[^>]*>

Жадный             Ленивый
*                  *?
+                  +?
{n,}               {n,}?

Позиция внутри строки

Если мы хотим найти конкретную фразу, а не слово, то используем следующие спецсимволы:
^ - начало текста (строки)
$ - конец текста (строки)
Если использовать их, мы будем уверены, что в наш текст не закралось ничего лишнего:
Regex: ^Я нашёл!$
Я нашёл!
Не найдёт:
Смотри! Я нашёл!
Я нашёл! Посмотри!

Замена (replace)
Важная функция регулярных выражений - не только найти текст, но и заменить его на другой текст!
Простейший вариант замены - слово на слово:
Regex: Ольга
Замена: Макар
Текст был: Привет, Ольга!
Текста стал: Привет, Макар!



Но что, если у нас в исходном тексте может быть любое имя?
Вот что пользователь ввёл, то и сохранилось. А нам надо на Макара теперь заменить
Как сделать такую замену? Через знак "$". Давайте разберёмся с ним подробнее.
Знак "$" в замене - обращение к группе в поиске. Ставим знак "$" и номер группы.
Группа - это то, что мы взяли в круглые скобки. Нумерация у группу начинается с 1.

Regex: (Оля) \+ Маша
Замена: $1
Текст был: Оля + Маша
Текст стал: Оля

Мы искали фразу "Оля + Маша" (круглые скобки не экранированы, значит, в искомом тексте их быть не должно, это просто группа)
А заменили её на первую группу - то, что написано в первых круглых скобках то есть текст "Оля"



     */

}
