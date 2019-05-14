import java.io.*; 
 class TaskSeven
{ 
    public static void main(String args[]) 
    {
    System.out.println("STUDENT1");
    String Str = new String("Ali,18,BE Electronics;Aisha,19,BE-Electronics");  
    String st[]=Str.split(";") ;
    st[0]="Ali,18,BE-Electronics";
    st[1]="Aisha,18,BE-Electronics";
    String st1[]=st[0].split(",");
    String st2[]=st[1].split(",");
    System.out.println("Name:"+st1[0]);
    System.out.println("Age"+st1[1]);
    System.out.println("Program:"+st1[2]);
    System.out.println();
    System.out.println("STUDENT2");
    System.out.println("Name:"+st2[0]);
    System.out.println("Age:"+st2[1]);
    System.out.println("Program:"+st2[2]);


} 
} 