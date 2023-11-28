public class Main {
    public static void main (String [] args) {
        try {
            int z=10/0;
            System.out.println(z);
        }
        catch (ArithmeticException e) {
            System.out.println ("Exception="+e.getMessage());
        }
        finally {
            System.out.println ("This is a final block");
        }
    }
}

output:
Exception=/ by zero
This is a final block
