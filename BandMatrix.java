import java.util.*;                //importing util.* library for taking the input from the user
public class BandMatrix           //class declaration
{
    public static void main(String[]args)         //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n=");
        int n=sc.nextInt();
        System.out.println("enter the value of width=");
        int width=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j!=0)
                    System.out.print("   ");
                if(Math.abs(j-i)>width)
                    System.out.print("0");
                else
                    System.out.print("*");
                if(j!=n)
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}