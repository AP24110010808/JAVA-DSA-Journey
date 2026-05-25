import java.util.Scanner;

public class NestedIf
{
    public static void main(String[] Args)
    {
        int a,b,c;
        Scanner NI=new Scanner(System.in);

        System.out.println("Enter A Value");
        a=NI.nextInt();

        System.out.println("Enter B Value");
        b=NI.nextInt();

        System.out.println("Enter C Value");
        c=NI.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                  System.out.println("A is Greatest");
            }
            
        }
        if(b>c)
        {
            if(b>a)
            {
                  System.out.println("B is Greatest");
            }
           
        }
        if(c>a)
        {
            if(c>b)
            {
                  System.out.println("C is Greatest");
            }
         
        }


    }
}