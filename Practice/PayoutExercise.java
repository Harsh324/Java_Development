package Practice;

import java.util.*;  

/**
 * 
 */
public class PayoutExercise {
    public static void main(String[] args){
        /**
         * Create 10 sample employees of different types, add them using Company.addEmployee
         * and then call performEmployeePayout()
         */
        Company CPY = new Company();

        Executive E1 = new Executive("Dr. Aniket Pingley", "9876543210", "1100222125");
        Executive E2 = new Executive("Harsh Upadhyay", "9876543211", "1100222124");
        Executive E3 = new Executive("Harsh Tripathi", "9876543212", "1100222123");


        Engineer En1 = new Engineer("Sam", "9876543213", "1100222122");
        Engineer En2 = new Engineer("Sid", "9876543214", "1100222121");
        Engineer En3 = new Engineer("Govind", "9876543215", "1100222120");

        Intern In1 = new Intern("Rohit Sharma", "9876543216", "1100222119");
        Intern In2 = new Intern("King Kohli", "9876543217", "1100222118");
        Intern In3 = new Intern("MS Dhoni", "9876543218", "1100222117");
        Intern In4 = new Intern("Sachin Tendulkar", "9876543219", "1100222116");

        CPY.addEmployee(E1);
        CPY.addEmployee(E2);
        CPY.addEmployee(E3);
        CPY.addEmployee(En1);
        CPY.addEmployee(En2);
        CPY.addEmployee(En3);
        CPY.addEmployee(In1);
        CPY.addEmployee(In2);
        CPY.addEmployee(In3);
        CPY.addEmployee(In4);

        CPY.performEmployeePayout();


    }
}

/**
 * 
 */
class Company{
    private ArrayList<Employee> employee_list = new ArrayList<Employee>();

    /**
     * Method to add employee
     * @param e The employee object
     */
    public void addEmployee(Employee e){
        employee_list.add(e);
    }

    /**
     * Simulation for performing monthly payout of all employees
     */
    public void performEmployeePayout(){
        for(Employee emp:employee_list)    
            System.out.println(emp.get_pay());    
    }
}


abstract class Employee{
    private String _name;
    private String _phone;
    private String _aadharId;
    /** 
     * All employees get the minimum base pay
     */
    protected static final int _basePay = 1000;

    public Employee(String name, String phone, String aadharId){
        /**
         * add implementation here
         */
        this._name = name;
        this._phone = phone;
        this._aadharId = aadharId;
    }

    public String get_aadharId() {
        return _aadharId;
    }

    public String get_phone() {
        return _phone;
    }

    public void update_phone(String phone) {
        this._phone = phone;
    }

    public String get_name() {
        return _name;
    }
    
    /**
     * Pay of an employee is basicPay + bonus
     * @return
     */
    abstract int get_pay();
}

class Executive extends Employee{
    private static int _bonus = 1250;
    public Executive(String name, String phone, String aadharId){
        /**
         * add implementation here
         */
        super(name, phone, aadharId);

    }
    int get_pay()
    {
        return _basePay + _bonus;
    }

}

class Engineer extends Employee{
    private static int _bonus = 500;
    public Engineer(String name, String phone, String aadharId){
        /**
         * add implementation here
         */
        super(name, phone, aadharId);
    }
    int get_pay()
    {
        return _basePay + _bonus;
    }
}

class Intern extends Employee{
    private static int _bonus = 0;
    public Intern(String name, String phone, String aadharId){
        /**
         * add implementation here
         */
        super(name, phone, aadharId);
    }  
    int get_pay()
    {
        return _basePay + _bonus;
    }        
}
