import java.util.ArrayList;
import java.util.List;

public class StaticTest {
    private int _id;  // instance variable
    private String _name; // instance variable
    private static String _company; // This is not instance variable it has fixed memory location.

    public static List<String> _lstrs = new ArrayList<String>();
    static
    {
        _company = "IIITN";
        _lstrs.add("affff"); // composition
        _lstrs.add("sffgr");
    }

    public static void doSomething(String s, StaticTest obj)
    {
        _company = "IIITN";
        obj._name = s;
    }

    StaticTest(int id, String name)
    {
        this._id = id;
        this._name = name;
    }

    int getID()
    {
        return this._id;
    }

    String getName()
    {
        return this._name;
    }

    public static void main(String[] args)
    {
        StaticTest test = new StaticTest(3, "Harsh");
        // test, _id, _name is located in different memory location.

        String C = StaticTest._company;

        StaticTest test1 = new StaticTest(54, "Tripathi");
        // test2, _id, _name is located on different memory location.

    }
    
}
