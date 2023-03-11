import java.util.*;             //importing util.* library to take data input from the user.
public class HelloGoodbye       //class declaration
{
    public static void main(String []args)         //method/routine declaration
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the first person's name=");
        String name_1=sc.next();
        System.out.println("enter the second person's name=");
        String name_2=sc.next();
        System.out.println("Hello "+name_1+" and "+name_2+".");                           //printing name in 1st and 2nd order.
        System.out.println("Goodbye "+name_2+" and "+name_1+".");                      //printing name in 2dn and 1st order.
    }
}