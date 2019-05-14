import java.util.Scanner;
class TaskTwo
{
	Scanner input=new Scanner(System.in);
	private int array[]=new int[5];
	public void set()
	{
		System.out.println("Enter Elements For array ");
		for(int i=0;i<=4;i++)
		{
			array[i]=input.nextInt();
		}
	}
	public void get()
	{
		int even=0;
		int odd=0;
		for(int j=0;j<=4;j++)
		{
			if(array[j]%2==0)
			{
			System.out.println(array[j]);
			even++;
			}
		
		}
	System.out.println("Even Number : "+(even));
	for(int j=0;j<=4;j++)
	{
		if(array[j]%2!= 0)
		{
			System.out.println(array[j]);			
			++odd;
		}
		
	}
	System.out.println("Old Numbers : "+(odd));

	
}
}
class TaskTwoMain
{
	public static void main(String[] args) 
	{
		TaskTwo t1=new TaskTwo();
		t1.set();
		t1.get();
	}
}