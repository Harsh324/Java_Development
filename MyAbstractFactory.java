public class MyAbstractFactory {}

class TiagoFactory extends MyAbstractFactory{}

class TataCar
{}

class TiagoCar extends TataCar
{}

class AltrozCar extends TataCar
{}

class HarrierCar extends TataCar
{}

class SafariCar extends TataCar
{}

class PunchCar extends TataCar
{}

enum CarModel
{
    TIAGO, AlTROZ, HARRIER, SAFARI, PUNCH
}

class Main
{
    public static void main(String[] args)
    {

    }
}