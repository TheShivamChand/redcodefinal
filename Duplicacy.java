import java.util.Scanner;
class Dupli
{
public static void main(String[] arg)
{
 Scanner sc=new Scanner(System.in);
 int[] a={4,7,8,6,2,5,4,8,6,3};
 int size=a.length;
int j;
 System.out.println("Size before deletion: "+size);
 for(int i=0;i<size;i++)
 {
  for(j=i+1;j<size;j++)
  {
   if(a[i]==a[j])
   {
    while(j<(size)-1)
    {
     a[j]=a[j+1];
     j++;
    }
    size--;
   }
  }
 }
 
 for(j=0;j<size;j++)
 {
  System.out.println(a[j]);
 }
}
}