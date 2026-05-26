import java.util.Scanner;

public class Nestedloop
{
    public static void main(String[] Args)
    {
        int i, j, n, m ;

        Scanner SC = new Scanner(System.in);

        System.out.println("Enter upto which table you want:");
        n = SC.nextInt();

        System.out.println("Enter multiplication limit for each table:");
        m = SC.nextInt();

        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= m; j++)
            {
                System.out.println(i + " * " + j +" = "+ i*j);
            }
        }
    }
}
