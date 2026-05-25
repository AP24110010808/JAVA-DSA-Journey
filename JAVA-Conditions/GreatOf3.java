import java.util.Scanner;

public class GreatOf3
{
    public static void main(String[] Args)
    {
        int a,b,c;
        Scanner Go=new Scanner(System.in);

        System.out.println("Enter A Value");
        a=Go.nextInt();

        System.out.println("Enter B Value");
        b=Go.nextInt();

        System.out.println("Enter C Value");
        c=Go.nextInt();

        if(a>b && a>c)
        {
           
                  System.out.println("A is Greatest");
            
        }
        if(b>c && b>a)
        {

                  System.out.println("B is Greatest");
           
        }
        if(c>a && c>b)
        {
            
                  System.out.println("C is Greatest");
         
        }


    }
}