package Generics;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        ExceptionDemo exp = new ExceptionDemo();
//        System.out.println( exp.divide(10,0));
        
        
        CloningDemo cl = new CloningDemo(10);
        CloningDemo cl1 = new CloningDemo(20);
        CloningDemo cl3 = (CloningDemo) (cl1.clone());
        System.out.println(cl3.getVal());
    }
}
