package Oops;

public class Singelton {
    private Singelton(){
        System.out.println("instance is Created");
    }

    public static Singelton ins;
    public static Singelton  getInstance()
    {
        if(ins == null)
        {
            ins = new Singelton();
        }
        return ins;
    }
}
