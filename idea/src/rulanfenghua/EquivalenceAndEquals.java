package rulanfenghua;

public class EquivalenceAndEquals {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);

        System.out.print(n1 == n2);
        System.out.println();
        System.out.print(n1 != n2);
        System.out.println();

        System.out.print(n1.equals(n2));
    }
}
