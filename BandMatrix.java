//  Q. Write a program BandMatrix.java that takes two integer command-line
//     arguments n and width and prints an n-by-n pattern like the ones below, with a zero (0) for each
//     element whose distance from the main diagonal is strictly more than width, and an asterisk (*)
//     for each entry that is not, and two spaces between each 0 or *.


import java.util.*;                //importing util.* library for taking the input from the user
public class BandMatrix           //class declaration
{
    public static void main(String[]args)         //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n=");
        int n=sc.nextInt();                               //entering the value of n for size of the matrix.
        System.out.println("enter the value of width=");
        int width=sc.nextInt();                           //entering the value of column size.
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
