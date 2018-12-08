package rulanfenghua;

public class Dog {
    String name;
    String say;
    int i;

    Dog() {

    }
    Dog(String name, String say) {
        this.name = name;
        this.say = say;
    }
    public void dogSay() {
        System.out.print("name: " + this.name + ", say: " + this.say);
    }
    public void printInt() {
        System.out.print(this.i);
    }


    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Ruff!");
        Dog scruffy = new Dog("scruffy", "Wurf!");
        Dog ass = new Dog();

        spot.dogSay();
        System.out.println();
        scruffy.dogSay();
        System.out.println();
        ass.dogSay();
        System.out.println();
        ass.printInt();
    }
}