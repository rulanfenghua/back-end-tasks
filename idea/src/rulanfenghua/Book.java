package rulanfenghua;

public class Book {
    boolean checkedOut;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }
    protected void finalize() {
        if(checkedOut) {
//            super.finalize(); // 需要异常处理
            System.out.print("Error: checked out");
        }
    }

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
