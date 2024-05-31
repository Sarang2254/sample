import java.util.Scanner;

public class inputvalue {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");

        int a=s.nextInt();
        int b=s.nextInt();
        
        System.err.println(a+"  "+b);
    }
}
