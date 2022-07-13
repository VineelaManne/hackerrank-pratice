import java.util.Scanner;
class Upperlower
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the alphabet");
      char ch=sc.next().charAt(0);
      if(ch>='A' && ch<='Z')
      {
        System.out.println("uppercase");
        
      }
      else{
        System.out.println("lower case");
      }
    }
  }