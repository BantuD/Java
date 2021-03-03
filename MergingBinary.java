import java.lang.*;
public class MergingBinary
{
	public static void main(String arg[])
	{
		byte a=9,b=12,c=0;
		c=(byte)(c|a<<4);
		c=(byte)(c|b);
		System.out.println("Value of c: "+c);
		System.out.println("Value of a is " +((c&0b11110000)>>4));
		System.out.println("Value of b is: "+(c&0b00001111));
                //System.out.println("Value of c now: "+c);

	}
}

