import java.util.*;
class prime{
    public static void main (String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        if(x%2==0){
            System.out.println("prime");
        }else {
            System.out.println("odd");
        }
    }
    
}
