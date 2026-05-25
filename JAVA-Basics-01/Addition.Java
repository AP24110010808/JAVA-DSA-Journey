import java.util.Scanner;
public class Addition
{
  public static void main(String[]args)
  {

    int A,B,Sum;
    Scanner Sm=new Scanner(System.in);

    System.out.println("Enter Value A");
    A=Sm.nextInt();

    
    System.out.println("Enter Value B");
    B=Sm.nextInt();

    Sum=A+B;

    System.out.println("Sum ="+Sum);
  }

}