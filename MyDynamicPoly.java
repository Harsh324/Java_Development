public class MyDynamicPoly {

    void run()
    {
        System.out.println("run() MyDynamicPoly");
    }
    
}


class DerivedDynamicPoly extends MyDynamicPoly
{
    void run()
    {
        System.out.println("run() DerivedDynamicPoly");
    }
}


class Main
{
    public static void main(String[] args)
    {
        DerivedDynamicPoly d = new DerivedDynamicPoly();
        d.run();
    }
}