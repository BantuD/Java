import java.lang.*;
import java.util.*;
public class Cubiod
{
  public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
     
     int length,breadth,height; //Variables for input
     int totalArea,volume; //Variables to calculate
       
       System.out.println("Enter Lenth,Breadth and Height");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        
        totalArea=2*(height*length+length*breadth+breadth*height); //formula to calculate total area of cubiod
        volume=length*breadth*height;  //formula to calculate volume of cubiod

        System.out.println();
        System.out.println("Total Area: "+totalArea);
        System.out.println("Volume: "+volume);
     }
 }
     
