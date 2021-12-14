interface IntNumber
{
    void ins(int item);
    int delt();
}

class HacEar implements IntNumber
{
    private int stck[];
    private int pos;
    
    HacEar(int size)
    {
        stck = new int[size];
        pos = -1;
    }
    public void ins(int item)
    {
        if(pos == stck.length -1)
        {
            System.out.println("overflow");
        }else{
            stck[++pos] = item;
        }
    }
    
    public int delt()
    {
        if(pos < 0)
        {
            System.out.println("UF");
            return 0;
        }else{
            return stck[pos--];
        }
    }
}

class HelloWorld  {
    public static void main(String[] args) {
       HacEar obj = new HacEar(3);
       for(int i =0 ; i<4; i++)obj.ins(i);
       for(int i =0 ; i<=3 ; i++)
       {
           System.out.println(obj.delt());
       }
    }
}