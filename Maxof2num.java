import java.util.Scanner;
class Maxof2num
  {
    public static void main(String args[])
    {
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the numbers");
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b)
        System.out.println(a+"MAximum number");
      else
      {
           System.out.println(b+"MAximum number");
      }
    }
  }