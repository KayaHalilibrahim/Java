import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	
	public static void main(String[] args) {
		
	
	Book b1 = new Book("xax", 534, "s","2012");
    Book b2 = new Book("csdc", 568, "a b","2013");
    Book b3 = new Book("s", 656, "b","x");
    Book b4 = new Book("d", 320, "f","2019");
    Book b5 = new Book("h", 177, "z","1943");

    System.out.println("\n********** List ordered by title of the book **********");
    Set<Book> bookSetByName = new TreeSet<>();
    bookSetByName.add(b1);
    bookSetByName.add(b2);
    bookSetByName.add(b3);
    bookSetByName.add(b4);
    bookSetByName.add(b5);

    for (Book book : bookSetByName){
        System.out.println(book);
    }

    System.out.println("\n********** List ordered by the number of pages of the book **********");
    Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getPage_number() - o2.getPage_number();
        }
    });

    bookSetByPageCount.add(b1);
    bookSetByPageCount.add(b2);
    bookSetByPageCount.add(b3);
    bookSetByPageCount.add(b4);
    bookSetByPageCount.add(b5);

    for (Book book : bookSetByPageCount){
        System.out.println(book);
    }
	
}
}