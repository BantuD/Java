import java.lang.*;

public class Transpose
 {
  public static void main(String arg[])
  {
   int i,j,k=0;
   int a[][]=new int[3][3]; 
  for(i=0;i<3;i++)
   {
      for(j=0;j<3;j++)
       {
          a[i][j]=Integer.parseInt(arg[i+j+k]);
       }
      /* System.out.println("");
       System.out.println("value of j is: "+j);
      */ 
      k+=j-1;
 }
System.out.println("1st Array");
 for(i=0;i<3;i++)
 {
  for(j=0;j<3;j++)
  {
  System.out.print(a[i][j]+" ");
  }
    System.out.println("");
  }
 
 }
}

       