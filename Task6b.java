class Marksheet
{
	private double english;
	private double computer;
	private double dcld; 
	public Marksheet(double english,double computer,double dcld)
	{
		this.english=english;
		computer=computer;
		dcld = dcld;
	}
	public int getTotalMarks()
	{
		return 300;
	}
	public double getObtainedMarks()
	{
		return (english+computer+dcld);
	}
	public double getPercentage()
	{
		return ( ( (getObtainedMarks()/getTotalMarks())*100 ) );
	}
	public char getGrade(double percentage)
	{
		char grade=0;
		if(percentage>=90)
		{
			grade='A';
		}
		else if(percentage<90 && percentage>=80){
			grade='B';
		}
		else if(percentage<80 && percentage>=70){
			grade='C';
		}
		else if(percentage<70 && percentage>=60){
			grade='D';
		}
		return grade;
	} 
}