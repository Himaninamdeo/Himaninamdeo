import java.util.scanner;
public class Main{
    public static void main (String[] args){
        Scanner s=new Scanner (System.in);
        System.out.println("Enter value of n");
        int n= S.nextInt();
        try{
            int dividebyzero=5/n;
            System.out.println("Rest of code");
        }
        catch(ArithmeticException e){
            System.out.println("Exception" +e.getMessage());
        }
    }
}
