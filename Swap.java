import java.lang.*;
public class Swap
{
	public static void main(String arg[])
	{
		int a=5,b=12;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		//Now perform XOR operation and store it into a 
		a=a^b;
		//Now perform xor operation and store it into b
		b=a^b;
		//Now perform XOR operation and store it into a
		a=a^b;

               	System.out.println("Value of a: "+a);
                System.out.println("Value of b: "+b);
   	  }
}

