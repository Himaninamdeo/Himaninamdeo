class FinalDemo{
    public void display(){
        System.out.println("This is a final method,");
    }
}
class Main extends FinalDemo{
    public void display(){
        System.out.println("The final method is ovverriden");
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.display();
    }
}

    
