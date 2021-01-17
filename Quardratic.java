import java.lang.*;
import java.util.*;
public class Quardratic 
{
  public static void main(String arg[])
  {
    int a,b,c;
    double root1,root2,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A B and C of quardratic equetion");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    temp=-Math.sqrt(b*b-4*a*c);
    root1= (-b-temp)/(2*a);
    root2= (-b+temp)/(2*a);
    System.out.println("Root 1 is: "+root1);
    System.out.println("Root 2 is: "+root2);
  }
}

//Note:
//This will give "NaN" if value of "b*b -4ac" is negative
