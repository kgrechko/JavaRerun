package ua.hillel.hw3;
import java.util.Scanner;

public class PrintMonthInWorldCase2 {
    public static void main(String[] args) {
        System.out.println("Select number of month to get the month name");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
            switch(m)
            {
                case 1:
                    System.out.println("JAN");
                    break;

                case 2:
                    System.out.println("FEB");
                    break;

                case 3:
                    System.out.println("MAR");
                    break;

                case 4:
                    System.out.println("APR");
                    break;

                case 5:
                    System.out.println("MAY");
                    break;

                case 6:
                    System.out.println("JUN");
                    break;

                case 7:
                    System.out.println("JUL");
                    break;

                case 8:
                    System.out.println("AUG");
                    break;

                case 9:
                    System.out.println("SEP");
                    break;

                case 10:
                    System.out.println("OCT");
                    break;

                case 11:
                    System.out.println("NOV");
                    break;

                case 12:
                    System.out.println("DEC");
                    break;

                default:
                    System.out.println("Invalid month");

            }
    }
}
