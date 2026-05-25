import java.util.Scanner;

public class Division
{
 public static void main(String[] args)
 {
    Double A,B,Answer;
    Scanner Dv=new Scanner(System.in);

    System.out.println("Enter value A");
    A=Dv.nextDouble();

    System.out.println("Enter value B");
    B=Dv.nextDouble();

    Answer=A/B;

    System.out.println("Answer="+Answer);

 }

}