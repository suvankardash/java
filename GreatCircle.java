// Q. The great-circle distance is the length of the shortest path between two points (x1,y1) and (x2,y2) 
//    on the surface of a sphere, where the path is constrained to be along the surface.
//    Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2, and y2
//    the latitude and longitude (in degrees) of two points on the surface of the earth 
//    and prints the great-circle distance (in kilometers) between them. Use the following Haversine formula
//    where r=6,371.0 is the mean radius of the Earth (in kilometers).


import java.util.*;             //importing util.* library for taking user input
public class GreatCircle       //class declaration
{
    public static void main(String[] args)     //method/routine declaration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of first latitude=");
        double x1=Math.toRadians(sc.nextDouble());                //entering the value of 1st latitude in degrees which will then get converted to radians.
        System.out.println("enter the value of first longitude=");
        double y1=Math.toRadians(sc.nextDouble());                //entering the value of 1st longitude in degrees which will then get converted to radians.
        System.out.println("enter the value of second latitude=");
        double x2=Math.toRadians(sc.nextDouble());                //entering the value of 2nd latitude in degrees which will then get converted to radians.
        System.out.println("enter the value of second longitude=");
        double y2=Math.toRadians(sc.nextDouble());                //entering the value of 2nd longitude in degrees which will then get converted to radians.
        double distance=0.0;
        double mean_radius=6371.0;              //mean radius of earth
        double a=(x2-x1)/2;
        double b=(y2-y1)/2;
        double c=Math.pow(Math.sin(a),2);
        double d=Math.pow(Math.sin(b),2);
        double e=Math.cos(x1);
        double f=Math.cos(x2);
        double g=Math.sqrt(c+(e*f*d));
        double h=Math.asin(g);
        distance=2*mean_radius*h;                  //calculating great circle distance using the Haversine Formula 
        System.out.println("distance="+distance);     //printing the final great circle distance
    }
}
