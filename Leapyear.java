import java.util.Scanner;
class Leapyear{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    if(n%4==0)
    {
      System.out.println("leap year");
      
    }
  else
    {
      System.out.println("not leap year");
    }

} 
}