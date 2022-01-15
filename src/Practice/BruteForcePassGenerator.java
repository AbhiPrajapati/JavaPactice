package Practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BruteForcePassGenerator {
    private String customString;
    private int digit;

    public BruteForcePassGenerator(String customString, int digit) {
        this.customString = customString;
        this.digit = digit;

    }
    public void generatePasswords()
    {
        String initial = "";
        int end = 1,start =1;
        for (int i = 0; i < this.digit; i++) {
             end *= 10;
             start *= 10;
             initial += "0";
        }
        start /= 10;
        ArrayList<String> arr  = new ArrayList<>();
        arr.add(this.customString+initial);
        for (int i = start; i <= end; i++) {
            String pass = this.customString + (i);
            try{
                Writer output;
                output = new BufferedWriter(new FileWriter("C:\\Users\\Abhishek\\Desktop\\JavaPactice\\src\\Practice\\pass.txt",true));
                //FileWriter fw = new FileWriter("C:\\Users\\Abhishek\\Desktop\\JavaPactice\\src\\Practice\\pass.txt",true);
                //fw.write(pass);
                //fw.close();
                output.write(pass+'\n');
                output.close();



            }catch(Exception exception)
            {
                System.out.println(exception.getMessage());
            }


        }

        System.out.println("Generated Passsword");
    }

    public static void main(String[] args) {
         BruteForcePassGenerator bg = new BruteForcePassGenerator("tushar@",10);
         bg.generatePasswords();
    }
}
