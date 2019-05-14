class TaskThree
{
	private String name,breed;
		int age;
	public void setDetails(String x,String y,int z)
	{
		name=x;
		breed=y;
		age=z;
	}
	public void showDetails()
	{
		if(name!=null && breed!=null && age!=0)
		{
		System.out.println("Name of the dog is "+name);
		System.out.println("Breed of the dog is "+breed);
		System.out.println("Age of the dog is "+age);
		}
		else
		{
			System.out.println("Details are unavailable.");
		}
	}
}
class TaskThreeMain
{
	public static void main(String[] args) 
	{
		TaskThree t1=new TaskThree();
		t1.setDetails("Tom","Persion",3);
		t1.showDetails();
	}
}