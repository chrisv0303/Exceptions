package exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a numerator");
            int numerator = scanner.nextInt();
            System.out.println("Enter a denominator");
            int denominator = scanner.nextInt();

            try{
                System.out.println("Result is: " + numerator / denominator);
                break;
            }catch (ArithmeticException exception){
                System.out.println("Cannot divide by 0. Try again!");
            }
        }while (true);
    }
}
