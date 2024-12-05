import java.util.*;
public class GREATERnum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
            if(b>c)
            {
                System.out.println(":B is bigger");
            }
            else if(a>b)
            {
                System.out.println("C is bigger");
            }
            else
            {
                System.out.println("A is bigger");
            }
        }
        else
        {
            if(a>c)
            {
                System.out.println("A is bigger");
            }
            else if(b>c)
            {
                System.out.println("C id bigger");
            }
            else
            {
                System.out.println("B is bigger");
            }
        }
    }
}

    
