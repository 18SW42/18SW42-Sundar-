import java.util.Scanner;
class TaskFive
{
	
	public void get(int english,int computer,int dcld)
	{
		
		int total=300;
		int obtained=english+computer+dcld;
		int percentage=((obtained*100)/total);
		System.out.println("Total marks  :"+(total));
		System.out.println("Percantage   : "+percentage);
		if(percentage>80)
		{
			System.out.println("Grade : A1 ");
		}
		else if(percentage<80 || percentage>70)
		{
			System.out.println("Grade : A ");
		}
		else if(percentage<70 || percentage>60)
		{
			System.out.println("Grade : B ");
		}
		else if(percentage<60 || percentage>50)
		{
			System.out.println("Grade : C ");
		}
		else if(percentage<50 || percentage>40)
		{
			System.out.println("Grade :  D ");
		}
		else if(percentage<40)
		{
			System.out.println("FAIL");
		}
	}
}
class TaskFivemain
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		int english,computer,dcld;
		System.out.println("Enter marks of English");
		english=input.nextInt();
		System.out.println("Enter marks of Computer Programming");
		computer=input.nextInt();
		System.out.println("Enter marks of DCLD");
		dcld=input.nextInt();
		TaskFive obj1=new TaskFive();
		obj1.get(english,computer,dcld);
		
	}
}