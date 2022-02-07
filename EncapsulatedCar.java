/**
 * This module implements an example for encapsulation
 * @author Harsh Tripathi
 * @version v1.0
 */



public class EncapsulatedCar
{
    private String make;
    private int year;
    private boolean isAWD;
    private String color;
    private String model;


    /**
     * 
     * @param make This will be make of this car
     * @param year The year of the car
     * @param isAWD The power of wheel status
     */

    public EncapsulatedCar(String make,int year, boolean isAWD)
    {
        this.make = make;
        this.year = year;
        this.isAWD = isAWD;
    }

    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public String getColor()
    {
        return color;
    }
    public boolean getisAwd()
    {
        return isAWD;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}


class MainCar
{
    public static void main(String[] args)
    {

        EncapsulatedCar myFirstCar = new EncapsulatedCar("Mahindra", 2022, true);
        myFirstCar.setColor("Red");
        myFirstCar.setModel("XUV700");
        
        System.out.println(myFirstCar.getMake() + 
        '\t'+myFirstCar.getModel() + "\t"+myFirstCar.getColor());
    }
}