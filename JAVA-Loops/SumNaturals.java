import java.util.Scanner;

public class SumNaturals
{

    public static void main(String[] Args)
    {

        int i,n,sum=0;

        Scanner SN=new Scanner(System.in);
        System.out.println("Entire i Value");
        i=SN.nextInt();

        System.out.println("Entire n Value");
        n=SN.nextInt();

        while(i<n)
        {
            sum=sum+i;

            System.out.println("Sum = " + sum);

            i++;
        }

    }
}