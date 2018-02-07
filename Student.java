class Student
{
static int id=1;
static String name="Shivam";
public static void details(String a)
{
Student obj=new Student();
System.out.println("ID: "+id+"\nName: "+name+"\nAddress: "+a);
}
public static void main(String args[])
{
String add="Jalandhar";
details(add);
}
}