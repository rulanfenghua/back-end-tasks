package rulanfenghua;


class Window {
    Window(int marker) {
        System.out.print("Window(" + marker + ")");
        System.out.println();
    }
}

class House {
    Window w1 = new Window(1);
    House() {
        System.out.print("House()");
        System.out.println();
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.print("f()");
    }
    Window w3 = new Window(3);
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
