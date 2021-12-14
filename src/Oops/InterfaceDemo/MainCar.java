package Oops.InterfaceDemo;

public class MainCar {
    private CarFun method;
    private MusicPlayer mp;

    public MainCar() {
         method = new CarFun();
         mp = new MusicPlayer();
    }

    public MainCar(CarFun method, MusicPlayer mp) {
        this.method = method;
        this.mp = mp;
    }

    public void start()
    {
        method.start();
    }
    public  void musicStart()
    {
        mp.start();
    }

    public static void main(String[] args) {

     MainCar car = new MainCar();
     car.start();
     car.musicStart();
    }
}
