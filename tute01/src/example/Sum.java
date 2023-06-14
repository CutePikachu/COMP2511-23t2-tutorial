package example;

import java.util.Scanner;

/**
 * Inside a new file called Sum.java, write a program that uses the Scanner class which reads in a line of numbers separated by spaces, and sums them.
 */
public class Sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        s.close();
        String[] numbers = line.split(" ");
        int sum = 0;
        // for (String n: numbers) {
        //     sum += Integer.parseInt(n);
        // }

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        
        System.out.println("The sum is " + sum);
    }
    
}
