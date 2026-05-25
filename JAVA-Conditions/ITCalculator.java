import java.util.Scanner;

public class ITCalculator
{
    public static void main(String[] Args)
    {
         Double income;
         Scanner IC=new Scanner(System.in);

         System.out.println("Enter Income");
         income=IC.nextDouble();
         
         if(income<=50000)
         {
         System.out.println("No Tax");
         }else if(income<=100000)
         {
            System.out.println("Tax : " + (income*0.1));
         }else
         {
            System.out.println("Tax : " + (income*0.2));
         }

    }
}