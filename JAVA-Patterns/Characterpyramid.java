import java.util.Scanner;

public class Characterpyramid
{
    public static void main(String[] Args)

    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of columns for pyramid");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            int Chars=i;

            for(j=1;j<=Chars;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
             System.out.println("");
        }
    }
}