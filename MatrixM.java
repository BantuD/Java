import java.lang.*;
public class MatrixM
{
 public static void main(String arg1[])
 {
   int a[][]=new int[3][3];
   int b[][]=new int[3][3];
   int c[][]=new int[3][3];
   int i,j,k=0;
  
//Converting Arg[] into 2d array till element 9 of matrix 1
 for (i=0;i<3;i++)
    {
     for(j=0;j<3;j++)
       {
         a[i][j]=Integer.parseInt(arg1[j+i+k]); //modifification
        }
       k+=j-1;
     }
 //End

k=0;
//Converting Arg[] into 2d array from element 10 to 19  of matrix 2
 for (i=0;i<3;i++)
    {
     for(j=0;j<3;j++)
       {
         b[i][j]=Integer.parseInt(arg1[j+i+k+9]); //modifification
        }
       k+=j-1;
     }
 //End


System.out.println("1st Array"); //Printing a[][] practice
  for(i=0;i<3;i++)    
 {    
  for(j=0;j<3;j++)    
  {    
  System.out.print(a[i][j]+" ");    
  }    
    System.out.println("");
  } 

System.out.println("");
System.out.println("2nd Matrix"); //Printing b[][] practice

  for(i=0;i<3;i++)    
  {    
  for(j=0;j<3;j++)    
 {    
  System.out.print(b[i][j]+" ");    
  }    
    System.out.println("");
  } 
  
  //Multiplication storing in array c//

for(i=0;i<3;i++)    
{    
   for(j=0;j<3;j++)    
   {    
     c[i][j]=0;    
     for(k=0;k<3;k++)    
     {    
       c[i][j]+=a[i][k]*b[k][j];    
     }    
   }    
}   
//End

System.out.println("");  //Printing
System.out.println("Multiplication");
for(i=0;i<3;i++)    
{    
  for(j=0;j<3;j++)    
 {    
  System.out.print(c[i][j]+" ");    
  }    
    System.out.println("");
} 
//end //
 
  }  
}
      