import java.util.Scanner;
import java.util.Random;

class Startup4{
	public static void main(String[] args)
	{
      int[] arr=new int [7];
	  String[] arr1=new String [7];
	  String [] game=new String[4];
	  Scanner input=new Scanner (System.in);
	  Random gen=new Random();
	  int count=0;
	  for(int i=0;i<4;i++)
	  {
		  int random=gen.nextInt(6);
		  boolean issame=false;
		  
		  System.out.println("r"+" "+random);
		  for (int j=0;j<count;j++)
		  {
			  if (arr[j]==random)
			  {
				  issame=true;
				  break;
			  }
		  }
			  if(!issame)
			  {
				  arr[count]=random;
				  count++;
			  
		  
		  }
	  }
		 
	 
	for (int data: arr)
	{
		System.out.println("arr"+" "+data);
	}
	
	for (int i=0;i<arr.length;i++)
	{
		arr1[i]="a"+arr[i];
		System.out.println("arr1"+arr1[i]);
		
	}
	int counter=0;
	for (int i=0;i<4;i++)
	{
		if (!arr1[i].equals("a0"))
		{
			game[i]=arr1[i];
			counter++;
			
		}
		System.out.println(game[i]);
		
		System.out.println("counter"+""+counter);
	}
	int a =counter;
	int b =game.length;
	 for(int i=1;i<=a;i++)
	 {
		 System.out.println("enter string guess ie:a0");
		String user=input.nextLine();
		boolean isequal=false;
		int hcount=0;
		for (int j=0;j<b;j++)
		{
			if (user.equals(game[j]))
			{
				game[j]="-1";
				hcount++;
				isequal=true;
				System.out.println("hit");
				if (hcount==counter && i==a)
				{
					System.out.println("better next time");
				}
				
			}
		}
		if(!isequal)
		{
			System.out.println("miss");
			if (hcount<counter && i==a)
			{
				System.out.println("u have missed");
			}
		}
		else if(hcount==counter && i==a )
		{
			System.out.println("killed");
		}
		else if(hcount<counter && i==a)
		{
			System.out.println("u have missed");
		}
		
	 }
}
}

		 
         		 
