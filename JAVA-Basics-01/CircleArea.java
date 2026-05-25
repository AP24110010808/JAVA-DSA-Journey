import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args)
    {
        Double Radius, Area;

        Scanner Ca = new Scanner(System.in);

        System.out.println("Enter Radius");
        Radius = Ca.nextDouble();

        Area = 3.14 * Radius * Radius;

        System.out.println("Area = " + Area);
    }
}