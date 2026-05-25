import java.util.Scanner;

public class While
{
    public static void main(String[] Args)
    {
        int i,n;
        Scanner WH=new Scanner(System.in);

        System.out.println("Enter i value:");
        i = WH.nextInt();

        System.out.println("Enter n value:");
        n = WH.nextInt();

        while(i<=n)
        {
            System.out.println(i);
         i++;
        }
    }
}
