package ru.mirea.pr3;

public class Recursion_3 {
    public static String recursion(int a, int b) {
        if (a > b)
        {
            if (a == b)
            {
                return "A = B";
            }
            return a + " " + recursion(a - 1, b);
        } else
            {
            if (a == b)
            {
                return "A = B";
            }
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(10, 2)); // вызов рекурсивной функции
        System.out.println(recursion(3, 13)); // вызов рекурсивной функции
    }
}