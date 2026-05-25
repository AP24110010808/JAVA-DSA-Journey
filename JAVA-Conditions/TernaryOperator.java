import java.util.Scanner;

public class TernaryOperator
{
    public static void main(String[] Args)
    {
        int Marks;
        Scanner TO=new Scanner(System.in);
        
        System.out.println("Enter Marks");
        Marks=TO.nextInt();

        System.out.println(Marks>=40?"pass":"fail");


    }
}