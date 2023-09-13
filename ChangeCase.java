public class ChangeCase{
    public static void main(String args[]){
        
        System.out.println("enter a String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter choice: - 0 for uppercase and 1 for lowercase");
        int i = sc.nextInt();
        switch(i){
            case 0: 
                System.out.println(s.toUpperCase());
                break;
                case 1:
                    System.out.println(s.toLowerCase());
                    break;
                    default:
                    System.out.println("Wrong number entered");
        }
    }
}

