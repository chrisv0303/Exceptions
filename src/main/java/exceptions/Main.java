package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a numerator:");
                int numerator = scanner.nextInt();
                System.out.println("Enter a denominator:");
                int denominator = scanner.nextInt();
                System.out.println("Result is: " + numerator / denominator);
                break;
            } catch (InputMismatchException e){
                System.out.println("Enter a whole number please!");
            } catch (ArithmeticException e){
                System.out.println("Cannot divide by 0. Try again!");
            }
        } while (true);

    }

}
