package Bai2_1;

public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book dummy = new Book("Java for dummies", ahTeck, 19.95, 99);
        System.out.println(dummy);

        dummy.setPrice(29.95);
        dummy.setQty(28);
        System.out.println("name is: " + dummy.getName());
        System.out.println("price is: " + dummy.getPrice());
        System.out.println("qty is: " + dummy.getQty());
        System.out.println("author is: " + dummy.getAuthor());
        System.out.println("author's name is: " + dummy.getAuthor().getName());
        System.out.println("author's email is: " + dummy.getAuthor().getEmail());
        Book anotherBook = new Book("more java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}
