import java.util.Arrays;

public class varLengthArgs {
    public static void main(String[] args) {
        fun("Abhishek","Ananya","D","Ram");
    }
    static void fun(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
