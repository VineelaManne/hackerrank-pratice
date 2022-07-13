import java.util.Scanner;
class Specialchar
  {
    public static void main(String args[])
    {
      
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the value");
      char ch=sc.next().charAt(0);
  
      if(ch>='a' && ch<='z'){
        System.out.println("Character");
      }
      else if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
      {
        System.out.println("Digit");
      }
      else{
        System.out.println("Special character");
      }
    }
  }