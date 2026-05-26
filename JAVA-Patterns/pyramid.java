import java.util.Scanner;

public class pyramid
{
    public static void main(String[] Args)

    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of columns for pyramid");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {

            int Stars=i;

            for(j=1;j<=Stars;j++)
            {
                System.out.print("*");
            }
             System.out.println("");
        }

    }
}