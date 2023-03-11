import java.util.*;                    //importing util.* library to take the data input from the user.
public class RightTriangle         //class declaration
{
    public static void main(String[] args)            //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first side of the triangle=");
        int side_1=sc.nextInt();
        System.out.println("enter the second side of the triangle=");
        int side_2=sc.nextInt();
        System.out.println("enter the third side of the triangle=");
        int side_3=sc.nextInt();
        if(side_1>0&&side_2>0&&side_3>0)              //checking if all the sides input from user are positive or not.
        {
            int sq_side_1=side_1*side_1;                       //squaring side 1
            int sq_side_2=side_2*side_2;                       //squaring side 2
            int sq_side_3=side_3*side_3;                       //squaring side 3
            if (sq_side_3==(sq_side_1 + sq_side_2))            //checking for the equality using pythogoras theorem
                System.out.println("true");
            else
                System.out.println("false");
        }
        else
            System.out.println("false");
    }
}