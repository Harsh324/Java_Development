public class AbstractClass {
    
}


class Car extends Vehicle
{
    public void moveWipers()
    {
        System.out.println("moveWipers from Car");
    }
}

class Tractor extends Vehicle
{
    public void moveLevers()
    {
        System.out.println("moveLevers from Tractors");
    }

    public void accelerate()
    {
        super.accelerate();
    }
}


class MainVehicle
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.accelerate();
        c.moveWipers();
        c.type = "Car";
        
        Vehicle v = new Vehicle();
        v.accelerate();

        Tractor t = new Tractor();
        t.accelerate();
        t.moveLevers();
        t.type = "Tractor";

    }
}
