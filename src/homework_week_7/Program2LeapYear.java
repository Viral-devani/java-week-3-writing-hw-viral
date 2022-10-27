package homework_week_7;/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Program2LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the year :");
        int year =scanner.nextInt();
        Program2LeapYear leapYear =new Program2LeapYear();
        leapYear.isItLeapYear(year);

    }
    public void isItLeapYear(int year){
        if(year %4 ==0 && year %100!=0 || year % 400==0){
            System.out.println("The year"+year+ " is leap year");
            return;
        }
        System.out.println("The 'year "+year+ " is not leap yeaar ");
    }
}
