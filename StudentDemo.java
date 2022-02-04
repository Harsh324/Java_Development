public class StudentDemo 
{
    private int id;  // instance or member varibale
    private String name;  
    private int[] data;

    // Parametrized constructor
    public StudentDemo(int _id, String _name)
    {
        id = _id;
        name = _name;
        System.out.println("StudentDemo object is created");
    }

    public StudentDemo(StudentDemo studDemo)
    {
        this.id = studDemo.id;
        this.name = studDemo.name;
        this.data = studDemo.data; // shallow copy
    }
    public StudentDemo(int[] vals)
    {
        data = vals; // this will not actually copy the data 
                    // Also called as shallow copy as it is copying only reference

        data = new int[vals.length];
        for(int i = 0; i < data.length; i++)
        {
            data[i] = vals[i];  // Deep copying 
        }

    }

    public void updateName(String newName)
    {
        name = newName; // mutable means you have to do deep copy
    }


    public StudentDemo updateArray(int[] Arr)
    {
        return new StudentDemo(Arr);
    }
    public void printState()
    {
        System.out.println("id = "+ id + "\tname = " + name);
    }

    public static void main(String[] args)
    {
        /*
        // StudentDemo s1 ; // stack
        // String s = "dtwegfda";  // stack
        // String f = new String();  // heap

        StudentDemo s1 = new StudentDemo(678,"V Kohli");  
        s1.printState();
        /*StudentDemo s2 = new StudentDemo(123, "MS Dhoni");  // heap
        s2.printState();*/
        StudentDemo s3 = new StudentDemo(456, "Sachin Tendulkar");
        s3.printState();
        //s3.updateName("VVS Laxman");
        //s3.printState();

        StudentDemo scc = new StudentDemo(s3); // heap
        scc.printState();
        
        /*
        int[] vals = {-1, 2, 4, -5};
        StudentDemo s4 = new StudentDemo(vals);
        System.out.println(s4.data[0]);
        vals[0] = -9;
        System.out.println(s4.data[0]);*/

        // String name = "MS Dhoni";
        // name.toUpperCase(); // immutability
        // System.out.println(name);

    }
}

/*

    struct record
    {
        int i;
        double j;
        float h;
    }

    class student
    {
        private:
            int id;
            std::string name;
            struct record* records studRecord;  // point to a memory location


        public:


    }
*/
