import java.util.Scanner;

public class For
{
    public static void main(String[] Args)
    {
 int i,n;
        Scanner FR=new Scanner(System.in);

        System.out.println("Enter i value:");
        i = FR.nextInt();

        System.out.println("Enter n value:");
        n = FR.nextInt();

    for(;i<=n;i++)
    {
        System.out.println(i);
    }

    }
}

