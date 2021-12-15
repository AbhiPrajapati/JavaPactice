package Generics;

import java.util.Arrays;

public class CustomArrayList<T>{


    private int size = -1;
    private Object[] data;
    private final int defaultSize = 10;
    public CustomArrayList() {
         data = new Object[defaultSize];
    }


    public void add(T val)
    {
        if(size == defaultSize-1)
        {
            Object [] temp = new Object[defaultSize*2];
            System.arraycopy(data, 0, temp, 0, size + 1);
            data = temp;
        }else{
            size++;
            data[size] = val;
        }
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", defaultSize=" + defaultSize +
                ", data=" + Arrays.toString(data) +
                '}';
    }



    public void size()
    {
        System.out.println(size+1);
    }
    public static void main(String[] args) {
        CustomArrayList<Integer> arr = new CustomArrayList();
        arr.size();
        for (int i = 0; i < 11; i++) {
            arr.add(i*2);
        }
        System.out.println(arr);
        arr.size();
    }
}
