package array_programs;

public class FrequencyOfElement {

	public static void freqElement(int []ar)
	{
		boolean []b=new boolean [ar.length];
		for(int i=0;i<ar.length;i++)
		{
			int c=1;
			if(b[i]==true)
				continue;
			
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					b[j]=true;
					c++;
				}					
			}
			System.out.println(ar[i]+"--->"+c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []a= {2,4,6,2,43,1,4};
        freqElement(a);
		
	}

}
