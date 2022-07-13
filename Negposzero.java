import java.util.Scanner;
class Negposzero
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      if(n==0){
        System.out.println(n+"zero");
      }
      else if(n>1)
      {
        System.out.println(n+"positive");
      }
      else{
        System.out.println(n+"Negative");
      }
    }
  }