import java.util.Scanner;
class Main{
    public static void main(String[] args){
        try{
            int n;
            Scanner Sc = new Scanner(System.in);
            System.out.println("enter value of n");
            n = Sc.nextInt();
            
            int divideByZero = 5/0;
            System.out.println("Rest of code in try block");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException"+ e.getMessage());
        }
    }
}
