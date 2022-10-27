package homework_week_7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program_16_FindPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=scanner.nextInt();
        findNumberISPositiveNegativeOrZero(number);
        scanner.close();

    }
    public static void findNumberISPositiveNegativeOrZero(int number){
        if(number>0) {
            System.out.println(number + " is a POSITIVE number ");
        } else if (number<0) {
            System.out.println(number + " is a NEGATIVE number ");
        }else {
            System.out.println(number + "  is ZERO ");

        }
    }
    }


