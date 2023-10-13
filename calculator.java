//create a calculator interface
interface calculator{
    void calculator(double num1,double num2,char operator);
}
public class BasicCalculator implements Calculator{
    public void calculator(double num1, double num2, char operator){
        switch(operator){
            case '+':
                System.out.println("Result:"+(num1+num2));
                break;
                case'-':
                    System.out.println("Result:"+(num1-num2));
                    break;
                    case'*':
                        System.out.println("Result:"+(num1*num2));
                        break;
                        case'/':
                            if(num2!=0){
                            System.out.println("Result:"+(num1/num2));
                            }else{
                                System.out.println("Error: Dividion by zero");
                            }
                            break;
                            default:
                            System.out.println("Error: invalid operator");
        }
    }
    public static void main(String[]args){
        
    calculator calculator= new BasicCalculator();
    double num1=10.0;
    double num2=5.0;
    char operator='+';
    calculator.calculator (num1,num2,operator);
    }
}
