package LEVEL2;

public class FindIthBit {
    public static void main(String[] args) {
        int n = 52;
        System.out.println(BitOnPos(n));
    }

    private static int BitOnPos(int n) {
        return (n & 1<<(n-1));
    }
}
