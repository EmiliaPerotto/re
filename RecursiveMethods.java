import java.util.Scanner;
public class RecursiveMethods{
  public RecursiveMethods(){//this is the default constructor

  }
    public static int factSequence(int n) {
      if (n == 0) {//this will calculate the factorial sequenc
        return 0;
      } 
        return n * factSequence(n-1);
      
  }
    public static int fibSequence(int n) {
      if (n <= 1) {//this will calculate the fibonnaci sequence
        return 1;
      } 
      
        return fibSequence(n-1) + fibSequence(n-2);
      
    }
    public static boolean isOdd(int n){
      if (n%2 == 0){//calculate using recursive method do not use modulus, this will also calculate whether n is even/odd
        return true;
      }
      else{
        return false;
      }

    }
  
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Input number: ");
    int factMethod = Integer.parseInt(in.nextLine());
    System.out.println("Input number: ");
    int fibMethod = Integer.parseInt(in.nextLine());
    System.out.println("Input number: ");
    int isOddMethod = Integer.parseInt(in.nextLine());
    System.out.println(RecursiveMethods.factSequence(factMethod));
    System.out.println(RecursiveMethods.fibSequence(fibMethod));
    System.out.println(RecursiveMethods.isOdd(isOddMethod));

}
}