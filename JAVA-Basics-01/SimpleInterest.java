import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        Double P, T, R, SI;

        Scanner Sp = new Scanner(System.in);

        System.out.println("Enter Principal");
        P = Sp.nextDouble();

        System.out.println("Enter Time");
        T = Sp.nextDouble();

        System.out.println("Enter Rate");
        R = Sp.nextDouble();

        SI = (P * T * R) / 100;

        System.out.println("Simple Interest = " + SI);
    }
}