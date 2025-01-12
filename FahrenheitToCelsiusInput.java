import java.util.Scanner;

public class FahrenheitToCelsiusInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //read keyboard input
        System.out.print("Enter a temperature in Fahrenheit: ");
        int fahrenheit = input.nextInt();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0; //convert to Celsius
        System.out.println("Celsius: " + celsius);
    }
}