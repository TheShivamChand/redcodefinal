import java.util.Scanner;
class ArrayDemo
{
public static void main(String args[])
{
 int[] a=new int[5];
 int aa[];
 aa=new int[5];
 int aaa[]=new int[5];
 int aaaa[]=new int[5];

 int[] intArray=new int[]{1,2,3,4,5,6,7,8,9,10};
 int ar[]={1,2,3,4,5};
 char arr[]={'a','b','c','d'};
 char arrc[]={65,66,67,68};
 float f[]={1.2f,4.2f,3.5f};
 double d[]={3,4,5,6.0};
 for(int i=0;i<ar.length;i++)
	{
	System.out.println(ar[i]+"\n");	
	}
 for(int i=0;i<a.length;i++)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value for "+i+" index");
	a[i]=sc.nextInt();
	}
 for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]+"\n");
	}
}
}