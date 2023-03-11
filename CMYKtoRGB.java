import java.util.Scanner;                //importing util.* library
public class CMYKtoRGB       //class declaration
{
    public static void main(String[] args)     //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of level of CYAN=");
        double cyan=sc.nextDouble();
        System.out.println("enter the value of MAGENTA=");
        double magenta=sc.nextDouble();
        System.out.println("enter the value of YELLOW=");
        double yellow=sc.nextDouble();
        System.out.println("enter the value of BLACK=");
        double black=sc.nextDouble();
        double white,red,green,blue;
        white=1-black;                       //white is the basis of all conversion
        double t=255*white;               //temporary variable to store the value to be used further.
        red=t*(1-cyan);                     //calculating equivalent red value
        green=t*(1-magenta);            //calculating equivalent green value
        blue=t*(1-yellow);                 //calculating equivalent blue value
        System.out.println("red="+red);
        System.out.println("green="+green);
        System.out.println("blue="+blue);
    }
}