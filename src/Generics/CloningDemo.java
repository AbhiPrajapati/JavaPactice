package Generics;

public class CloningDemo implements Cloneable{
    private int val;
    CloningDemo(int val)
    {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
