package ua.hillel.hw3;
import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println("Enter int number to check Odd or Even -> ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a%2 == 0)
        {
            System.out.println("number is Odd");
        }
        else
            System.out.println("number is Even");

    }
}
