package ua.hillel.hw2;
import java.lang.module.ResolutionException;
import java.util.Scanner;
import java.lang.Math;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float p = 3.14f;
        System.out.println("Enter circle radius -> ");
        float r = scan.nextFloat();
        System.out.println("Circle area = " + p*r*r);



    }
}
