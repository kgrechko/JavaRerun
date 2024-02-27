package ua.hillel.hw2;
import java.util.Scanner;

public class CelsiusToFarenheitToKelvin {
    public static void main(String[] args) {
        System.out.println("Enter Celsius value to convert to Fahrenheit and Kelvin->");
        Scanner scan = new Scanner(System.in);
        float c = scan.nextFloat();

        float f = c*9/5+32;

        float k = c+273;

        System.out.println("Celsius to Fahrenheit = " + f);
        System.out.println("Celsius to Kelvin = " + k);

    }
}
