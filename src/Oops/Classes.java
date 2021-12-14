package Oops;

class Book{
    int bookId;
    String bookName;
    String Author;
    float price;

    public Book(int bookId, String bookName, String author, float price) {
        this.bookId = bookId;
        this.bookName = bookName;
        Author = author;
        this.price = price;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector  is used");
    }
}

public class Classes {
    public static void main(String[] args) {
//        for (int i = 0; i < 1000000000; i++) {
//            Book b = new Book(12,"Hanuman Chalisa","Tulsi Dass",0.0f);
//        }

        Singelton instance =  Singelton.getInstance();
        System.out.println(instance);
        Singelton instance2 =  Singelton.getInstance();
        System.out.println(instance);
    }
}
