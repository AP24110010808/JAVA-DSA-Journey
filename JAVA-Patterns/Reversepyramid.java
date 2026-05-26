import java.util.Scanner;

public class Reversepyramid
{

public static void main(String[] Args)
{

    int i,j,n;
    Scanner sc=new Scanner(System.in);

    System.out.println("No Of Stars Start From");
    n=sc.nextInt();

    for(i=1;i <= n;i++)
    {
        for(j=1;j <= n-i+1;j++)
        {
            System.out.print("*");
        }

        System.out.println("");
    }


}
}