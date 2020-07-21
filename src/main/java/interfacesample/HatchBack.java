package interfacesample;

//A.S class_kw class_name implements_kw interface_name
public class HatchBack implements Car{

    public HatchBack()
    {
        System.out.println(BRAND);
        System.out.println("I have " + WHEELS + " wheels");
    }

    @Override
    public void createCar() {
        System.out.println("I am creating a HatchBack");
    }

    @Override
    public void addWinShield() {
        System.out.println("I am adding wind shield to my HatchBack");
    }

    @Override
    public void addWheels() {
        System.out.println("I am adding wheels to my HatchBack");
    }

    @Override
    public void addEngine() {
        System.out.println("I am adding engine my HatchBack");
    }

    @Override
    public void paint() {
        System.out.println("I am adding painting my HatchBack");
    }
}
