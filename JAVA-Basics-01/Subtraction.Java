import java.util.Scanner;

public class Subtraction
{
 public static void main(String[] args)
 {
    int A,B,Answer;
    Scanner Sb=new Scanner(System.in);

    System.out.println("Enter value A");
    A=Sb.nextInt();

    System.out.println("Enter value B");
    B=Sb.nextInt();

    Answer=A-B;

    System.out.println("Answer="+Answer);

 }

}