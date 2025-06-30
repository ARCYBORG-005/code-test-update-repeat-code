import java.util.Scanner;

class duplicatearr
{
	public static void main(String []args)
	{
		int [] arr={3,7,4,6,7,8,9,9};
		int [] arr1=new int [arr.length];
		int count=0;
		int i,j;
		boolean issame=false;
		for ( i=0;i<arr.length;i++)
		{
			for ( j=i;j<arr.length;j++)
			{
				if(i!=j)
				{
					if (arr[i]==arr[j])
					{
						System.out.println(arr[i]);
						arr[i]=-i;
					}
					
				  
					
					
	
				}
			}
		
			}
	
		
		
	}
}
		
		
		
		
			
		
