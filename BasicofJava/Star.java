import java.util.*;
 class Star {
    public static void main (String args[])
    {
        Scanner Sc= new Scanner(System.in);
       int age= Sc.nextInt();
       if(age>18){
        System.out.println("adult");
       }
       else{
        System.out.println("not adult");
       }

    }
}
