import java.util.Scanner;

public class IfElseIf
{
    public static void main(String[] Args)
    {
         int Score;
         Scanner IE=new Scanner(System.in);

         System.out.println("Enter Score");
         Score=IE.nextInt();
         
         if(Score>=90)
         {
         System.out.println("A Grade");
         }else if(Score>=70)
         {
            System.out.println("B Grade");
         }else if(Score>=40)
         {
            System.out.println("C Grade");
         }else
         {
            System.out.println("Fail");
         }

    }
}