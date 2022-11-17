package main.java203;

public class TwoArrays {
    /*
    Обработка двумерных массивов
--------------------------------------------------------------------
1. Инициализация массива с входными значениями:

Следующий цикл инициализирует массив со значениями, введенными пользователем:

    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Введите " + matrix.length + " строчек и " +
      matrix[0].length + " столбцов: ");
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        matrix[row][column] = input.nextInt();
  }
}

--------------------------------------------------------------------------
2. Инициализация массива со случайными значениями

Следующий цикл инициализирует массив со случайными значениями от 0 до 99:

for (int row = 0; row < matrix.length; row++) {
  for (int column = 0; column < matrix[row].length; column++) {
    matrix[row][column] = (int)(Math.random() * 100);
  }
}

------------------------------------------------------------------------
3. Отображение массива
Для отображения двумерного массива необходимо вывести каждый элемент массива с помощью цикла, например:

for (int row = 0; row < matrix.length; row++) {
  for (int column = 0; column < matrix[row].length; column++) {
    System.out.print(matrix[row][column] + " ");
  }
  System.out.println();
}

---------------------------------------------------------------------------
4. Суммирование всех элементов массива
Используйте переменную с именем total для хранения суммы. Инициализируйте total со значением 0. С помощью цикла
прибавьте к сумме каждый элемент массива, например:

int total = 0;
for (int row = 0; row < matrix.length; row++) {
  for (int column = 0; column < matrix[row].length; column++) {
    total += matrix[row][column];
  }
}

--------------------------------------------------------------------------
5. Суммирование элементов массива по столбцам
Для каждого столбца используйте переменную с именем total, чтобы сохранить сумму. С помощью цикла прибавьте к сумме
каждый элемент столбца, например:

for (int column = 0; column < matrix[0].length; column++) {
  int total = 0;
  for (int row = 0; row < matrix.length; row++)
    total += matrix[row][column];
  System.out.println("Сумма для столбца " + column
    + " равна " + total);
}

--------------------------------------------------------------------------
6. Какая строчка массива содержит наибольшую сумму?
Используйте переменные maxRow и indexOfMaxRow для отслеживания наибольшей суммы и индекса строчки. Для каждой строчки
вычислите ее сумму и обновите maxRow и indexOfMaxRow, если новая сумма больше текущей.
int maxRow = 0;
int indexOfMaxRow = 0;
// Вычислить сумму для первой строчки в maxRow
for (int column = 0; column < matrix[0].length; column++) {
  maxRow += matrix[0][column];
}
for (int row = 1; row < matrix.length; row++) {
  int totalOfThisRow = 0;
  for (int column = 0; column < matrix[row].length; column++)
    totalOfThisRow += matrix[row][column];
  if (totalOfThisRow > maxRow) {
    maxRow = totalOfThisRow;
    indexOfMaxRow = row;
  }
}
System.out.println("Строчка " + indexOfMaxRow
+ " содержит наибольшую сумму, равную " + maxRow);

--------------------------------------------------------------------------------
7. Перетасовка элементов массива
Чтобы выполнить перетасовку, для каждого элемента matrix[i][j] генерируются случайные индексы i1 и j1, и matrix[i][j]
переставляется с matrix[i1][j1] следующим образом:

for (int i = 0; i < matrix.length; i++) {
  for (int j = 0; j < matrix[i].length; j++) {
    int i1 = (int)(Math.random() * matrix.length);
    int j1 = (int)(Math.random() * matrix[i].length);
    // Переставить matrix[i][j] и matrix[i1][j1]
    int temp = matrix[i][j];
    matrix[i][j] = matrix[i1][j1];
    matrix[i1][j1] = temp;
  }
}
-----------------------------------------------------------------------------------
     */
}
