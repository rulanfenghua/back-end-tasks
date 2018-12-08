package rulanfenghua;

public class ThisLeaf {
    int i;

    ThisLeaf increment() {
        i++;
        System.out.print(this);
        System.out.println();
        return this;
    }
    void print() {
        System.out.print("i= "+ i);
    }

    public static void main(String[] args) {
        ThisLeaf x = new ThisLeaf();
        x.increment().increment().print();
    }
}
