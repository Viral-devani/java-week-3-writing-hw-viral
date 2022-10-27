package homework_week_7;

import java.util.Scanner;

public class Program6OddEven {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        Program6OddEven oddEven=new Program6OddEven();
        System.out.println(number + " is"+oddEven.isItEvenOrOddNumer(number)+" number");
        scanner.close();

    }
    public String isItEvenOrOddNumer(int number){
        if(number%2 ==0){
            return " Even";

        }else {
            return " odd";
        }

    }
}
