package main.java204;
/*
Вторая подзадача аналогична исходной задаче, но меньше ее по размеру. Существует два простых случая: (1) два конечных
символа не совпадают и (2) размер строки равен 0 или 1. В случае (1) строка не является палиндромом; в случае (2)
строка является палиндромом. Рекурсивный метод для этой задачи может быть реализован, как показано в программе
RecursivePalindromeUsingSubstring.
 */
public class RecursivePalindromeUsingSubstring {
    public static void main(String[] args) {
        System.out.println("ропот - это палиндром? " + isPalindrome("ропот"));
        System.out.println("топот - это палиндром? " + isPalindrome("топот"));
        System.out.println("я - это палиндром? " + isPalindrome("я"));
        System.out.println("ара - это палиндром? " + isPalindrome("ара"));
        System.out.println("ар - это палиндром? " + isPalindrome("ар"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) // простой случай
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) // простой случай
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));
    }
}
