package Oops.InterfaceDemo;

public class CarFun implements Methods{
    @Override
    public void start() {
        System.out.println("Engine Starts................");
    }

    @Override
    public void stop() {
        System.out.println("Engine stops.................");
    }

    @Override
    public void acc() {
        System.out.println("Cars Speed is increased............");
    }
}
