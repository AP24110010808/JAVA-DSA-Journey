import java.util.Scanner;

public class Modulus
{
 public static void main(String[] args)
 {
    int A,B,Answer;
    Scanner Md=new Scanner(System.in);

    System.out.println("Enter value A");
    A=Md.nextInt();

    System.out.println("Enter value B");
    B=Md.nextInt();

    Answer=A%B;

    System.out.println("Answer="+Answer);

 }

}