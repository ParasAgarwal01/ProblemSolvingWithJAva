import java.util.Scanner;
public class reversetraingle {
    public static void main (String args[])
    {
      try (Scanner sc = new Scanner(System.in)) {
        int x = sc.nextInt();
        for ( int i=x ; i<=0 ; i-- ){
          for ( int j=i ; j<=i ; j++ ){
              System.out.print("*");
          }
          System.out.println(" ");
          for ( int K=i ; K<=i ; K++ ){
              System.out.print(" ");
          }
          
         
        }
      }
    }
}
