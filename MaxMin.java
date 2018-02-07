import java.util.Scanner;

class Array
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int n,i,max=0,min=0;
System.out.println("Enter nuber of elements: ");
n=sc.nextInt();
System.out.println("ENter numbers: ");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
min=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
}
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("Maximum Element is: "+max);
System.out.println("Minimum Element is: "+min);
}
}