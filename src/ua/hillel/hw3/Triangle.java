package ua.hillel.hw3;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter triangle sides");
        System.out.println("a ->");
        int a = scan.nextInt();
        System.out.println("b ->");
        int b = scan.nextInt();
        System.out.println("c ->");
        int c = scan.nextInt();

            if (a==b && b==c)
            {
                System.out.println("Triangle is equilateral");
            }
            else
                if (a==b || b==c || c==a)
            {
                System.out.println("Triangle is isosceles");
            }
            else
                if (a+b<=c || a+c<=b || a+b<=c )
                {
                    System.out.println("Triangle is not existing");
                }
        else
                    System.out.println("simple triangle");
    }
}
