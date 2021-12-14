package Oops;

public  class SonAbstractDemo extends ParentAbstractDemo{
    @Override
    void printName(String name) {
        System.out.println("Hii "+name);
    }

    @Override
    void greeting() {
        System.out.println("Hello World...");
    }

    public static void main(String[] args) {
        SonAbstractDemo son = new SonAbstractDemo();
        son.printName("Abhishek");
        son.greeting();
    }
}
