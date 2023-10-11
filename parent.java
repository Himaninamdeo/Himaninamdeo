class Parent{
    void display(){
        System.out.println("This is the parent class");
    }
    void show(int num){
        System.out.println("The number in the parent class is:"+num);
    }
}
class Child extends Parent {
    void display(){
        System.out.println("this is the child class");
    }
    void show(double num){
        System.out.println("The number in the child class is:"+num);
    }
}
public class Main{
    public static void main (String[] args){
        Parent parentObj = new Parent();
        Child childObj.show(50);
        childObj.show(7.5);
        parentObj.display();
        childObj.display();
    }
}
