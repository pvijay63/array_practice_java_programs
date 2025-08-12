package array_programs;

public class EvenIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      int c[]= {3,5,0,9,4,2,8};
      
      for(int i=0;i<c.length;i++)
      {
    	  
    	  if(i%2==0)
    	  {
    		 
    	  System.out.println(c[i]+" ");
    	  }
    	  
    	  if(i%2==1)
    	  {
    		  
    		  System.out.println(c[i]+" ");
    	  }
      }
		
	}

}
