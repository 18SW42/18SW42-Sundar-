public class MainClass
	{
	public static void main(String[]args)
	{
		Student s=new Student("Sundar Kumar",19);
		Marksheet m=new Marksheet(3,3,3.2);
		s.setData(42,"Software",18,"MUET");
		AddedClass cc=new AddedClass(s,m);
		cc.createStudentResult();
	}
}