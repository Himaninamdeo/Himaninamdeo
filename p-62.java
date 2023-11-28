import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter value of n");
        try {
            int n=Integer.parseInt(s.nextInt() );
            if(99%n==0) {
            System.out.println (n+"is a factor of 95");
        }
        }
        catch (ArithmeticException e) {
            System.out.println ("Exception="+e.getMessage());
        }
        catch(NumberFormatException e) {
            System.out.println("Exception="+ e.getMessage);
        }
    }
}
