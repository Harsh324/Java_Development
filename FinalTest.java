public class FinalTest {
    private static final double pi = 3.14362356536753; // Instance variable


    public static void main(String[] args){

        //FinalTest.pi = 4.5;
        FinalClass F = new FinalClass();
    }
}
/**
 * I dont want this class to be inherited
 */
class FinalClass{

    public void someFunc(){}

}

class NewClass extends FinalClass
{
    public void someFunc()
    {}

}