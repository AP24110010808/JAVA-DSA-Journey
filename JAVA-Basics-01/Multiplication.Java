import java.util.Scanner;

public class Multiplication
{
 public static void main(String[] args)
 {
    int A,B,Answer;
    Scanner Ml=new Scanner(System.in);

    System.out.println("Enter value A");
    A=Ml.nextInt();

    System.out.println("Enter value B");
    B=Ml.nextInt();

    Answer=A*B;

    System.out.println("Answer="+Answer);

 }

}