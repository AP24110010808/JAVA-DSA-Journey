import java.util.Scanner;

public class RectangleArea
{
    public static void main(String[] args)
    {
        Double Length, Breadth, Area;

        Scanner Ra = new Scanner(System.in);

        System.out.println("Enter Length");
        Length = Ra.nextDouble();

        System.out.println("Enter Breadth");
        Breadth = Ra.nextDouble();

        Area = Length * Breadth;

        System.out.println("Area = " + Area);
    }
}