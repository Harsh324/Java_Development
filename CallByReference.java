public class CallByReference {

    public void performChange(Employee e, Admin a)
    {
        e.changeState();
        a.changeState();
    }

    public static void main(String[] args)
    {
        CallByReference cbr = new CallByReference();
        Employee e = new Employee();
        Admin a = new Admin();
        cbr.performChange(e, a);
    }
    
}

class Employee
{
    private int i;
    Employee()
    {
        i = 10;
    }
    public void changeState()
    {
        i++;
        System.out.println("Employee i = " + i);
    }
}

class Admin
{
    private int i;
    Admin()
    {
        i = 20; 
    }
    public void changeState()
    {
        i++;
        System.out.println("Admin a = "+ i);
    }
}
