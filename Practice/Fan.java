package Practice;

class Fan
{
    public void Off()
    {
        System.out.println("Fan is Off");
    }


    public void Low()
    {
        System.out.println("Fan Speed is Low");
    }


    public void Medium()
    {
        System.out.println("Fan Speed is Medium");
    }


    public void High()
    {
        System.out.println("Fan Speed is High");
    }   
}

class Regulator
{
    private Fan fan = new Fan();
    private int Count = 0;

    public Regulator()
    {
        fan.Off();
    }

    public void Knob()
    {
        if(Count == 0)
        {
            fan.Low();
            this.Count++;
        }
        else if(Count == 1)
        {
            fan.Medium();
            this.Count++;
        }
        else if(Count == 2)
        {
            fan.High();
            this.Count++;
        }
        else if(Count == 3)
        {
            fan.Off();
            this.Count = 0;
        }
    }

    public static void main(String[] args)
    {
        Regulator Reg = new Regulator();
        Reg.Knob();
        Reg.Knob();
        Reg.Knob();
        Reg.Knob();

    }
}
