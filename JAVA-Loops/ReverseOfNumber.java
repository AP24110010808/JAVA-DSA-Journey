import java.util.Scanner;

public class ReverseOfNumber
{
    public static void main(String[] Args)
    {
        int num,lastdigit,reversednum=0;
        Scanner NM=new Scanner(System.in);

        System.out.println("Enter Value");
        num=NM.nextInt();

        while(num>0)
        {
            lastdigit=num%10;
            reversednum = reversednum*10+lastdigit;
            num=num/10;
        }

        System.out.println(reversednum);
    }
}