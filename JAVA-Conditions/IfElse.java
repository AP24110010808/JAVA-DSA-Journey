import java.util.Scanner;

public class IfElse
{

 public static void main(String[] Args)
 {

    int a,b;
    Scanner IE=new Scanner(System.in);

    System.out.println("Enter A Value");
    a=IE.nextInt();

    System.out.println("Enter B Value");
    b=IE.nextInt();

    if(a>b)
    {
        System.out.println("A is greatest");
    }
    else
    {
        System.out.println("B is greatest");
    }

}
}