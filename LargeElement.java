package array_programs;
import java.util.*;
public class LargeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a length of an array");
      int size=sc.nextInt();
      int a[]=new int [size];
      System.out.println("entering the elements of array");
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=sc.nextInt();
      }
      int largest=0;
      for(int j=0;j<size;j++)
      {
    	  if(a[j]>largest)
    		  largest=a[j];
      }
      System.out.println("The largest element of an array is "+largest);
      sc.close();
		
	}

}
