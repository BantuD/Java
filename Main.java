import java.lang.*;
class Car
{
  String model;
  int price;
  static String mfr;  //static and non static memeber/function calling from static and non static methos
  String fuel; 
  Seat t; //This is called Abregation
  Car(){}
  Car(String m,int p,String f,Seat t1)
    {
     model = m;
     price = p;
     t=t1;
     fuel=f;
     t=t1;
     }
}
class Seat
{
 double price;
 String material;
 String color;
 Seat(){}
 Seat(double p,String m,String c)
   {
     price = p;
     material = m;
     color = c;
   
    }
}
public class Main
{
 int i=10; 
 public static void main(String arg[])
  {
  int y; 
  Seat s1=new Seat(2000,"Leather","Mild");
   Seat s2=new Seat(2800,"Raxine","Blue");
   Car c1=new Car("QX1",57,"diesel",s1);
   Car c2=new Car("Q8",85,"diesel",s2);
   Car.mfr="BMW";
   System.out.println("For car 1");

   System.out.println("Car Model "+ c1.model);
   System.out.println("Car Price "+ c1.price);
   System.out.println("Car Manufacture "+c1.mfr);
   System.out.println("Car Fuel Type: "+c1.fuel);
   System.out.println("Car Seat Type: "+c1.t.material);
   System.out.println("For Car 2");

   System.out.println("Car Model "+ c2.model);
   System.out.println("Car Price "+ c2.price);
   System.out.println("Car Manufacture "+c2.mfr);
   System.out.println("Car Fuel Type: "+c2.fuel);
   System.out.println("Car Seat Type: "+c2.t.material);

  // System.out.println(i);
  y=printi();
  System.out.println("Value of Y" +y);
  }
  public static int printi()
 {
  return i;
 }


}