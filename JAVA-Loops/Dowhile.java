import java.util.Scanner;

public class Dowhile
{
    public static void main(String[] Args)
    {
        int i,n;
       
        Scanner DW=new Scanner(System.in);

        System.out.println("Enter i value:");
        i = DW.nextInt();

        System.out.println("Enter n value:");
        n = DW.nextInt();

        do
        {
            System.out.println(i);
         i++;
        }while(i<=n);
    }
}