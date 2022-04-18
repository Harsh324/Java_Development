class Trying 
{
    private int Name;
    public void Number()
    {
        System.out.println("YES in Trying class");
    }

}

class Baby extends Trying
{
    private int Name1;

    public void Number()
    {
        System.out.println("YES in Baby class");
    }

    public static void main(String[] args)
    {
        Trying t = new Baby
    }

}
