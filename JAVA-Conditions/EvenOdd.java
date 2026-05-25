import java.util.Scanner;

public class EvenOdd
{

 public static void main(String[] Args)
 {

    int value;
    Scanner IE=new Scanner(System.in);

    System.out.println("Enter Value");
    value=IE.nextInt();

    if(value%2==0)
    {
        System.out.println("Value is Even");
    }
    else
    {
        System.out.println("Value is Odd");
    }

}
}