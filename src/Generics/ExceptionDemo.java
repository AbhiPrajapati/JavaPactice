package Generics;

public class ExceptionDemo {

    public int  divide(int a , int b)
    {
        try{
            return a/b;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("completed...");
        }
        return -1;
    }


}
