import java.util.Scanner;
class Evenndodd{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
   
      if(n%2==0)
      {
    System.out.println("n="+n+ " Even");
  }
      else{
        System.out.println("n="+n+" odd");
      }
}
}
