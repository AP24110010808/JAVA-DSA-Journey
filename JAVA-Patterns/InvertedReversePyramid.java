import java.util.Scanner;

public class InvertedReversePyramid
{

    public static void main(String[] Args)
    {

        int i,j,k,n;

        Scanner sc=new Scanner(System.in);

        System.out.println("No Of Stars Start From");
        n=sc.nextInt();


        for(i=1;i<=n;i++)
        {

            int Space = i-1;

            for(j=1;j<=Space;j++)
            {
                System.out.print(" ");
            }

            int Stars = n-i+1;

            for(k=1;k<=Stars;k++)
            {
               System.out.print("*");
            }

            System.out.println("");

        }
    }
}