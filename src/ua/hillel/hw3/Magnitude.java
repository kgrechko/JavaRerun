package ua.hillel.hw3;
import java.lang.Math;
import java.util.Scanner;

public class Magnitude {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number ->");
        a = scan.nextInt();
        System.out.println("Enter second number ->");
        b = scan.nextInt();
        int am = Math.abs(a);
        int bm = Math.abs(b);
        if (am > bm)
        {
            System.out.println("a is bigger than b");
        }
        else
            if (am < bm)
            {
                System.out.println("b is bigger than a");
            }
            else
            {
                System.out.println("numbers are equal");
            }
    }
}
