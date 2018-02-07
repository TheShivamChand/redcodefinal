import java.util.Scanner;

class st
{
 public static void main(String a[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Type integer for line 1");
    String line1=sc.nextLine();
    System.out.println("Type an integer for line 2");
    int line2=sc.nextInt();
    sc.nextLine();
    System.out.println("Type in something for line 3");
    
    String line3=sc.nextLine();

    System.out.println("Type an integer for line 4");
    double line4= sc.nextDouble();
    System.out.println("Line1: "+line1+"\nLine2: "+line2+"\nLine3: "+line3+"\nLine4: "+line4);
  }
}

