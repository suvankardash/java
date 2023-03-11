import java.util.*;
public class GeneralizedHarmonic      //class declaration
{
    public static void main(String[]args)     //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n=");
        int n=sc.nextInt();
        System.out.println("enter the value of r=");
        int r=sc.nextInt();
        double sum=0.0;
        for(int i=0;i<n;i++)
        {
            sum+=(1/Math.pow(i+1,r));
        }
        System.out.println("sum of harmonic series = "+sum);
    }
}