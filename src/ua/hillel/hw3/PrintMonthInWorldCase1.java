package ua.hillel.hw3;
import java.util.Scanner;

public class PrintMonthInWorldCase1 {
    public static void main(String[] args) {
        System.out.println("Select number of month to get the month name");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        if (m==1)
        {
            System.out.println("JAN");
        }
        else
        if (m==2)
        {
            System.out.println("FEB");
        }
        else
        if (m==3)
        {
            System.out.println("MAR");
        }
        else
        if (m==4)
        {
            System.out.println("APR");
        }
        else
        if (m==5)
        {
            System.out.println("MAY");
        }
        else
        if (m==6)
        {
            System.out.println("JUN");
        }
        else
        if (m==7)
        {
            System.out.println("JUL");
        }
        else
        if (m==8)
        {
            System.out.println("AUG");
        }
        else
        if (m==9)
        {
            System.out.println("SEP");
        }
        else
        if (m==10)
        {
            System.out.println("OCT");
        }
        else
        if (m==11)
        {
            System.out.println("NOV");
        }
        else
        if (m==12)
        {
            System.out.println("DEC");
        }
        else
            System.out.println("Invalid number");
    }
}
