import java.util.Arrays;

class File
{
    public static void main(String args[])
    {
        System.out.println("Hello Folks!");

        byte r8 = -21; // 8 bit
        short r16 = 20; // 16 bit
        int r32 = 45; // 32 bit
        long r64 = 78; // 64 bit
        float s32 = 45.36f; // 32 bit
        double s64 = 67.34 ;// 64 bit
        boolean b = true;
        char c16 = 'a'; // 16 bit

        int myArray[] = {23, 45, -9, 8, 56, 0, 1, 3};
        System.out.println("Printing theis primitive array as list: "+Arrays.asList(myArray));
    }
}