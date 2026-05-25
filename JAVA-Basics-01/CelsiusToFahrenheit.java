import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Double Celsius, Fahrenheit;

        Scanner Cf = new Scanner(System.in);

        System.out.println("Enter Celsius");
        Celsius = Cf.nextDouble();

        Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("Fahrenheit = " + Fahrenheit);
    }
}