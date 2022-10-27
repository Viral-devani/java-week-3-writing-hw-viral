package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Program1OddEvenTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
         scanner.close();
    }
    public static void isItOddOrEvenNumber(int number){
        String evenOrOdd=(number%2==0)? "Even" : "idd";
        System.out.println("The "+number + " is "+evenOrOdd+ " number ");
    }
}
