package Oops.InterfaceDemo;

public class MusicPlayer implements Player{
    @Override
    public void start() {
        System.out.println("Music player started.........");
    }

    @Override
    public void stop() {
        System.out.println("Music player Stopped.......");
    }
}
