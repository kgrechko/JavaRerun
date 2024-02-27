package ua.hillel.hw2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vertical height of triangle -> ");
        float h = scanner.nextFloat();
        System.out.println("Enter length of triangle -> ");
        float a = scanner.nextFloat();
        float A = a*h/2;
        System.out.println("Area of square triangle is " + A);
    }
}
