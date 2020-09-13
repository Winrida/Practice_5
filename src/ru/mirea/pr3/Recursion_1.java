package ru.mirea.pr3;

public class Recursion_1
{
    public static int recursion(int k)
    {
        int a = 0, b = 0;
        if(k == 1)
        {
            return 1;
        }
        for (int i = 0; a < k; i++)
        {
            a += i;
            b = i;
        }

        System.out.print(recursion(--k) + " " + b);
        return 0;
    }

    public static void main(String[] args) {
        System.out.print(recursion(5));
    }
}
