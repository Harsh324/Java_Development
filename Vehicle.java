import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

class MyMouseListener implements MouseInputListener
{

    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("mouse was clicked");
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    
}

interface MyTestInterface
{
    void someMethod1(int l);
    void someMethod2(float l);
    void someMethod3(String l);
}

class MyConcreteClass implements MyTestInterface
{

    @Override
    public void someMethod1(int l) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void someMethod2(float l) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void someMethod3(String l) {
        // TODO Auto-generated method stub
        
    }
    
}

class MainClass
{
    public static void main(String[] args)
    {
        //MyTestInterface t = new MyTestInterface();
        MyConcreteClass cc = new MyConcreteClass();
        MyTestInterface tc = new MyConcreteClass();
    }
}

/*
public abstract class Vehicle
{
    protected String type;

    abstract void pumpFuel();

    public void accelerate()
    {
        System.out.println("Accelerating from base Vehicle");
    }
}

class Car extends Vehicle
{
    public void moveWipers()
    {
        System.out.println("moveWipers from Car");
    }

    @Override
    void pumpFuel() {
        // TODO Auto-generated method stub
        
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

    @Override
    void pumpFuel() {
        // TODO Auto-generated method stub
        
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
        
        //Vehicle v = new Vehicle();
        //v.accelerate();

        Tractor t = new Tractor();
        t.accelerate();
        t.moveLevers();
        t.type = "Tractor";

    }
}*/


