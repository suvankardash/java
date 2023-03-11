import java.util.*;             //importing util.* library for taking user input
public class GreatCircle       //class declaration
{
    public static void main(String[] args)     //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of first latitude=");
        double x1=Math.toRadians(sc.nextDouble());
        System.out.println("enter the value of first longitude=");
        double y1=Math.toRadians(sc.nextDouble());
        System.out.println("enter the value of second latitude=");
        double x2=Math.toRadians(sc.nextDouble());
        System.out.println("enter the value of second longitude=");
        double y2=Math.toRadians(sc.nextDouble());
        double distance=0.0;
        double mean_radius=6371.0;              // mean radius of earth
        double a=(x2-x1)/2;
        double b=(y2-y1)/2;
        double c=Math.pow(Math.sin(a),2);
        double d=Math.pow(Math.sin(b),2);
        double e=Math.cos(x1);
        double f=Math.cos(x2);
        double g=Math.sqrt(c+(e*f*d));
        double h=Math.asin(g);
        distance=2*mean_radius*h;                  //calculating great circle distance
        System.out.println("distance="+distance);
    }
}