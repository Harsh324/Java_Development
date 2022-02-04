public class MyPublicClass 
{
    public static void main(String[] args)
    {
        MyPrivateClass mpc = new MyPrivateClass();
        mpc.someMethodPrivate();
        //MyNestedPrivateClass mnpc = new MyNestedPrivateClass();

    }
    // Same file can not have two public classes

    class MyNestedPrivateClass
    {}
}

class MyPrivateClass
{
    MyPrivateClass()
    {
        System.out.println("Constructor for MyPrivateClass is called");

    }
    void someMethodPrivate()
    {
        System.out.println("someMethodPrivate in MyPrivateClass is called");
    }
}
