//Write a Java program to compute the distance between two points on the surface of earth.

import java.util.Scanner;

public class DistanceTwoPointsOnEarth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the latitude of point one: ");
        double lat1=in.nextDouble();

        System.out.print("Input the longitude of point one: ");
        double lon1=in.nextDouble();

        System.out.print("Input the latitude of point two: ");
        double lat2=in.nextDouble();

        System.out.print("Input the longitude of point two: ");
        double lon2=in.nextDouble();

        System.out.println("The distance between these point is: " + distanceBetweenPoints(lat1, lon1, lat2, lon2) + " kilometers");
    }

    private static double distanceBetweenPoints(double lat1, double lon1, double lat2, double lon2)
    {
        double earthRadius= 6371.01;
        lat1=Math.toRadians(lat1);
        lon1=Math.toRadians(lon1);
        lat2=Math.toRadians(lat2);
        lon2=Math.toRadians(lon2);

        return earthRadius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1-lon2));
    }
}