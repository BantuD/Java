import java.util.*;
class AreaOfTriangle {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float area,s;
       System.out.println("Enter A B C:>");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       s=(a+b+c)/2f;
       area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("Area of Triangle is: "+area);
    }
}