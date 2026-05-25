import java.util.Scanner;

public class Average
{
 public static void main(String[] args)
 {
    Double A,B,Answer;
    Scanner Ag=new Scanner(System.in);

    System.out.println("Enter value A");
    A=Ag.nextDouble();

    System.out.println("Enter value B");
    B=Ag.nextDouble();

    Answer = (A + B) / 2;

    System.out.println("Answer="+Answer);

 }

}
 