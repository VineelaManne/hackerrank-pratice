import java.util.Scanner;
class Maxof3num
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
      if(a>b && a>c)
      {
        System.out.println(a+"maximum number");
      }
      else if(b>c)
      {
        System.out.println(b+"maximum number");
      }
      else{
        System.out.println(c+"maximum number");
      }
    }
  }