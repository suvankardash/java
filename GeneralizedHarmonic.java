// Q. Write a program GeneralizedHarmonic.java that takes two integer command-line arguments n and r
//    and uses a for loop to compute the nth generalized harmonic number of order r,
//    defined by the following formula:
//       H(n,r) = 1/(1^r) + 1/(2^r) + 1/(3^r) + 1/(4^r) + ..... + 1/(n^r)


import java.util.*;         //importing libraries for user input.
public class GeneralizedHarmonic      //class declaration
{
    public static void main(String[]args)     //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n=");
        int n=sc.nextInt();                             //used to take input of n for calculation of nth generalized harmonic.
        System.out.println("enter the value of r=");
        int r=sc.nextInt();                             //used to take input of r for calculating generalized harmonic of order r.
        double sum=0.0;
        for(int i=0;i<n;i++)
        {
            sum+=(1/Math.pow(i+1,r));                       //summing up the values.
        }
        System.out.println("sum of harmonic series = "+sum);
    }
}
