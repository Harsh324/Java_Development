package Practice;


import java.util.ArrayList;

class Utilities
{
    private ArrayList<String> Utils = new ArrayList<>();
    private ArrayList<Integer> Costs = new ArrayList<>();

    public void Set_Utilities()
    {
        Utils.add("Coke");
        Costs.add(20);

        Utils.add("Snack");
        Costs.add(10);

        Utils.add("Chocolate");
        Costs.add(10);

        Utils.add("Lassi");
        Costs.add(15);

        Utils.add("Limca");
        Costs.add(15);

        Utils.add("Coffee");
        Costs.add(30);

        Utils.add("Soda");
        Costs.add(25);
    }

    public Utilities()
    {
        this.Set_Utilities();
    }
}

class Vendor 
{
    private int Price;
    private Utilities Util = new Utilities();

    public Vendor(int Penny)
    {
        this.Price = Penny;
    }

    public void Get()
    {

    }

    public static void main(String[] args)
    {
        Vendor Ven = new Vendor(10);
    }
}
