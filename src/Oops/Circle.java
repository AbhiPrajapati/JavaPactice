package Oops;

public class Circle extends Shapes{
    private int rad;
    Circle(int rad)
    {
        super();
        this.rad = rad;
    }

     public void method1()
     {
         System.out.println("I am Method One...");
     }
    public void area()
    {
        System.out.println("The circle rad  is "+" "+rad);
    }
    public static void main(String[] args) {
        Circle obj = new Circle(20);

    }
}
