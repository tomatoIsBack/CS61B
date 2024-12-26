class IntWrapper {
    int x;
    public IntWrapper(int value) {
        x = value;
    }
}
public class SwapPrimitives {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        IntWrapper c = new IntWrapper(a);
        IntWrapper d = new IntWrapper(b);
        swap(c, d);
        a = c.x;
        b = d.x;
    }

    public static void swap(IntWrapper a, IntWrapper b) {
        int tmp = a.x;
        a.x = b.x;
        b.x = tmp;
    }
}