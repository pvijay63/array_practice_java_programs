package array_programs;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[]= {3,4,7,3,9,5,4,7};
		
		for(int i=0;i<b.length;i++)
		{
			
		for(int j=1;j<b.length;j++)
		{
			
			if(b[j]==b[i])
			{
				System.out.println(b[j]+" ");
			}
		}
	}

	}
}
