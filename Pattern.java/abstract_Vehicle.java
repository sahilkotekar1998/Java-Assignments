abstract class Vehicle
{
    abstract void start();
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("car starts with key");
    }
}
class Scooter extends Vehicle
{
    void start()
    {
        System.out.println("scooter starts with kick");
    }
}
public class abstract_Vehicle
{
    public static void main (String[]args){
        Car c = new Car();
        c.start();
    }
}