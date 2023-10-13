public class Automoblie{
    public void start()
{
    System.out.println("engine starts running");
    public void stop()
    {
        System.out.println("engine stops running");
    }
    public void seatings(){}
}
class Car extends Automobile{
    public void No_of_tyres()
    {
        System.out.println("there are 4 tyres");
    }
    public void fuel(){
        System.out.println("petrol");
    }
    public void fule(String fuel){
        System.out.println("also runs in diesel");
    }
    public void seating(){
        System.out.println("4 seating");
    }
}
class Bike extends Automobile{
    public void No_of_tyres()
    {
        System.out.printlm("there are 2 tyres");
    }
    public void fuel(){
        System.out.println("petrol");
    }
    public void seating(){
        System.out.println("2 seating");
    }
}
public class interface{
    public static void main(String args[])
    {
        Automobile a=new Automobile();
        a.star();
        a.stop();
        Car c=new Car();
        c.No_of_tyres();
        c.fuel();
        c.fuel("Diesel");
        c.seatings();
        Bike b=new Bike();
        b.No_of_tyres();
        b.fuel();
        b.seatings();
    }
}
