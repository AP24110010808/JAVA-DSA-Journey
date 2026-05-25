import java.util.Scanner;

public class TriangleArea
{
    public static void main(String[] args)
    {
        Double Base, Height, Area;

        Scanner Ag = new Scanner(System.in);

        System.out.println("Enter Base");
        Base = Ag.nextDouble();

        System.out.println("Enter Height");
        Height = Ag.nextDouble();

        Area = 0.5 * Base * Height;

        System.out.println("Area = " + Area);
    }
}