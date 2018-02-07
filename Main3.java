class Main
{
static int i;
public static void fun()
{
i++;
System.out.println(i);
if (i==5)
return;
fun();
}
public static void main(String ahy[])
{
Main obj=new Main();
final int a=5;
System.out.println(a);
obj.fun();
}
}