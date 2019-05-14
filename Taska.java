class Student
{
	private String name;
	private int age;
	private int rollno;
	private String department;
	private int batch;
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setData(int r,String department,int batch)
	{
		rollno=r;
		this.department=department;
		this.batch=batch;
	}
	public void showData()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Roll No: "+batch+"SW"+rollno);
		System.out.println("Department: "+department);
		System.out.println("Batch: "+batch);
	}
}