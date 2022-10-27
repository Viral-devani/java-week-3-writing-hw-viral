package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Program_17_SortArray {
    public static void main(String[] args) {


        //numeric array declaration
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        //String Array declaration
        String[] strArray = {"Alpha", "Bravo", "Delta", "Hotel", "Mike", "Siera", "Pete", "kilo"};
        System.out.println("Actual numeric array was :" + Arrays.toString(numArray));
        //sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted numeric array is :" + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array is :" + Arrays.toString(strArray));
        //sorting the string array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is : " + Arrays.toString(strArray));


    }

}
