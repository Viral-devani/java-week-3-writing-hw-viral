package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from âA to âFâ and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program_8_PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        char city = scanner.next().charAt(0);
        //object creation
        Program_8_PrintCityName cityName = new
                Program_8_PrintCityName();
        cityName.printCityName(city);
        scanner.close();

    }

    public void printCityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");

        } else if (city == 'C' || city == 'c') {

            System.out.println("Cambridge");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Derby");
        } else if (city == 'E' || city == 'd') {
            System.out.println("Edinburgh");

        } else if (city == 'F' || city == 'f') {
            System.out.println("Feltham");

        }else{
            System.out.println("The alphabet you enter is not between A to F");
        }
    }

}
