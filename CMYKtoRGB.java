//  Q. Several different formats are used to represent color. For example, the primary format for 
//     LCD displays, digital cameras, and web pages—known as the RGB format
//     —specifies the level of red (R), green (G), and blue (B) on an integer scale from 0 to 255.
//     The primary format for publishing books and magazines—known as the CMYK format—specifies
//     the level of cyan (C), magenta (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0.
//     Write a program CMYKtoRGB.java that converts from CMYK format to RGB format using these mathematical formulas :
//          white=1-black
//          red=255 X white X (1-cyan)
//          green=255 X white X (1-magenta)
//          blue=255 X white X (1-yellow)
//     Your program must take four double command-line arguments cyan, magenta, yellow, and black;
//     compute the corresponding RGB values, each rounded to the nearest integer; and print the RGB values, as in the following sample executions:



import java.util.Scanner;                //importing util.* library
public class CMYKtoRGB         //class declaration
{
    public static void main(String[] args)     //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of level of CYAN=");
        double cyan=sc.nextDouble();                            //entering the value of level of CYAN present. 
        System.out.println("enter the value of MAGENTA=");
        double magenta=sc.nextDouble();                         //entering the value of level of MAGENTA present.
        System.out.println("enter the value of YELLOW=");
        double yellow=sc.nextDouble();                          //entering the value of level of YELLOW present.
        System.out.println("enter the value of BLACK=");
        double black=sc.nextDouble();                           //entering the value of level of BLACK present.
        double white,red,green,blue;
        white=1-black;                       //white is the basis of all conversion
        double t=255*white;                  //temporary variable to store the value to be used further.
        red=t*(1-cyan);                      //calculating equivalent red value
        green=t*(1-magenta);                 //calculating equivalent green value
        blue=t*(1-yellow);                   //calculating equivalent blue value
        System.out.println("red="+red);
        System.out.println("green="+green);
        System.out.println("blue="+blue);
    }
}
