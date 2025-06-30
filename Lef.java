

class Lef{
    public static void main(String[] args)
	{
			int[] arr={1,2,2,3,1,3,3};
			int[] arr1=new int[arr.length];
		
			
			int i,j,count;
			boolean issame=false;
			for (i=0;i<arr.length;i++)
			{
				arr1[i]=arr[i];
			}
			for (i=0;i<arr.length;i++)
			{
				
				for (j=0;j<arr.length;j++)
				{
					if (i!=j)
					{
						if (arr[i]==arr[j])
						{
							arr[j]=-j;
						}
					}
						
					}
					System.out.println("arr"+" "+arr[i]);
				}
				for(i=0;i<arr.length;i++)
				{
					count=0;
					issame=false;
			       for (j=0;j<arr1.length;j++)
				   {
					   if (arr[i]>0)
					   {
						   if (arr[i]==arr1[j])
						   {
							   count++;
							   issame=true;
							   
						   }
						   
					   }
				   }
				   if (issame)
				   {
					   System.out.println(arr[i]+" "+count);
				   }
				   
				}
				
			}
}
			
			
	
			 
	

