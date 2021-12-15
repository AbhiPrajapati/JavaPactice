package Generics;

public class Comp implements Comparable<Comp>{
    private final int val;

    public Comp(int val) {
        this.val = val;
    }

    @Override
    public int compareTo(Comp o) {
        int diff = (int)(this.val - o.val);
        return diff;
    }

    public static void main(String[] args) {
        Comp com = new Comp(20);
        Comp com1 = new Comp(50);

        System.out.println( com1.compareTo(com));
    }


}
