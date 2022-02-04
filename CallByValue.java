public class CallByValue {
    

    public void performChange(int inp1, float inp2)
    {
        inp1 = inp1 * 5;
        inp2 = inp2 + 6;
    }

    public static void main(String[] args)
    {
        int a = 5;
        float b = 7.0f;
        System.out.println("a = "+ a + "\tb = " + b);
        CallByValue cbv = new CallByValue();
        cbv.performChange(a, b);
        System.out.println("a = "+ a + "\tb = " + b);
        
    }
}
