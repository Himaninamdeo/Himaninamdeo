public class TestThrow{
    public static void checkNum(String s){
        if(s == null){
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");
        }
        else{
            System.out.println();;
        }
    }
    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.checkNum(null);
        System.out.println("Rest of the code...");
    }
}
